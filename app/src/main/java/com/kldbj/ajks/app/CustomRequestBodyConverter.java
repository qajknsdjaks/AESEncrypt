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

import static com.kldbj.ajks.app.EncryptUtil.getMD5;
import static com.kldbj.ajks.app.EncryptUtil.getSHA256StrJava;
import static com.kldbj.ajks.app.EncryptUtil.getTimestamp;


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
        String data = EncryptUtil.encrypt(buffer.readByteString().toString());
        String sign = getMD5(getSHA256StrJava("data=" + data + "&timestamp=" + getTimestamp() +EncryptUtil. appKey));
        String timestamp=  getTimestamp();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("data",data);
        jsonObject.addProperty("sign",sign);
        jsonObject.addProperty("timestamp",timestamp);
        return RequestBody.create(MEDIA_TYPE ,jsonObject.toString() );
    }


}