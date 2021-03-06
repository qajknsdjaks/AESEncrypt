package com.kldbj.ajks.app;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.kldbj.ajks.app.bean.JsonTTTResult;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * 当前类注释：自定义ResponseBodyConverter
 * Author :LeonWang
 * Created  2016/10/11.11:33
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

final class CustomResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final TypeAdapter<T> adapter;
    private String mResult;

    CustomResponseBodyConverter(Gson gson,TypeAdapter<T> adapter) {
        this.gson = gson;
        this.adapter = adapter;
    }

    private final Gson gson;
    @Override
    public T convert(ResponseBody value) throws IOException {
        try {
            //解密
            String response = value.string();
            JsonTTTResult result = gson.fromJson(response , JsonTTTResult.class);
            Log.d("TAG", "================" + result.getData());
            try {
                mResult = EncryptUtil.decrypt(result.getData());
            } catch (Exception e) {
                e.printStackTrace();
            }
            Log.d("TAG", "--------------------------" + mResult);
            return adapter.fromJson(mResult);
        } finally {
            value.close();
        }
    }

}
