package com.kldbj.ajks.app;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;

import static com.kldbj.ajks.app.EncryptManager.appKey;


/**
 * 当前类注释：自定义RequestBodyConverter
 * Author :LeonWang
 * Created  2016/10/11.11:30
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public  class CustomRequestBodyConverter <T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    private final Gson gson;
    private final TypeAdapter<T> adapter;

    CustomRequestBodyConverter(Gson gson, TypeAdapter<T> adapter) {
        this.gson = gson;
        this.adapter = adapter;
    }

    @Override
    public RequestBody convert(T value) throws IOException {
        Buffer buffer = new Buffer();
        Writer writer = new OutputStreamWriter(buffer.outputStream(), UTF_8);
        JsonWriter jsonWriter = gson.newJsonWriter(writer);
        adapter.write(jsonWriter, value);
        jsonWriter.close();
        String data = EncryptManager.getInstance().encrypt(buffer.readByteString().toString());
        String sign = getMD5(getSHA256StrJava("data=" + data + "&timestamp=" + getTimestamp() + appKey));
        String timestamp=  getTimestamp();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("data",data);
        jsonObject.addProperty("sign",sign);
        jsonObject.addProperty("timestamp",timestamp);
        return RequestBody.create(MEDIA_TYPE ,jsonObject.toString() );
    }

    public static String getTimestamp() {
        return String.format("%010d", new Object[]{Long.valueOf(System.currentTimeMillis() / 1000)});
    }




    public static String getSHA256StrJava(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes("UTF-8"));
            return byte2Hex(instance.digest());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String byte2Hex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    private static String bytesToHex(byte[] var0) {
        StringBuilder var1 = new StringBuilder();
        int var2 = 0;

        for(int var3 = var0.length; var2 < var3; ++var2) {
            byte var4 = var0[var2];
            int var5 = var4;
            if (var4 < 0) {
                var5 = var4 + 256;
            }

            if (var5 < 16) {
                var1.append("0");
            }

            var1.append(Integer.toHexString(var5));
        }

        return var1.toString();
    }

    public static String getMD5(String var0) {
        try {
            var0 = bytesToHex(MessageDigest.getInstance("MD5").digest(var0.getBytes("UTF-8")));
        } catch (Exception var1) {
            var1.printStackTrace();
            var0 = "";
        }

        return var0;
    }
}