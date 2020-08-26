package com.kldbj.ajks.home.mvp.model;

import android.app.Application;
import android.util.Base64;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.kldbj.ajks.app.bean.JJKKTokenJson;
import com.kldbj.ajks.app.bean.JJKKTokenJson;
import com.kldbj.ajks.app.bean.JsonTTTResult;
import com.kldbj.ajks.app.service.CommonService;
import com.kldbj.ajks.home.mvp.bean.JsonMVListRecomm;
import com.kldbj.ajks.home.mvp.contract.MainContract;

import io.reactivex.Observable;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 07/24/2020 10:10
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
public class MainModel extends BaseModel implements MainContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public MainModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<JJKKTokenJson> getJJKKTokenJson() {
//        https://apid.bdxqhzs.com/s1/register/uuid/d30a10e0ed84d1cf?model=Xiaomi MI MAX 3&platform=android&key=e92c2fdb23428aa09f7a5e05bd879db6f0c62622936cea0f7de8b427a3d24689&version=3.9.2&lang=CN
        String host = "YXBpZC5iZHhxaHpzLmNvbQ==";
        host =  new String(Base64.decode(host.getBytes(), Base64.DEFAULT));
//      String url = "https://"+host+"/s1/register/uuid/d30a10e0ed84d1cf?model=Xiaomi MI MAX 3&platform=android&key=e92c2fdb23428aa09f7a5e05bd879db6f0c62622936cea0f7de8b427a3d24689&version=3.9.2&lang=CN";
        String url = "https://apid.dgzytop.com/s1/register/uuid/d30a10e0ed84d1cf?model=Xiaomi MI MAX 3&platform=android&key=e92c2fdb23428aa09f7a5e05bd879db6f0c62622936cea0f7de8b427a3d24689&version=3.9.2&lang=CN";
        Observable<JJKKTokenJson> result = mRepositoryManager.obtainRetrofitService(CommonService.class)
                .getJJKKTokenJson(url );
        return result;
    }

    @Override
    public Observable<JsonMVListRecomm> getMvListRecommend(int page) {

        JsonObject jsonObject = JsonParser.parseString("{\"system_version\":\"4.5.0\",\"app_status\":\"66232835727CB1EA23B603E54F94A2D0CDF60FBB:1\",\"system_oauth_type\":\"android\",\"system_oauth_id\":\"e5bca4ec21c98d2b258d5280e58ad4fe\",\"system_app_type\":\"local\",\"page\":\"1\",\"banner\":\"true\",\"system_token\":\"A7591FC748A3756309C6EA3C7FAC4D1531FEAB32AD8F101F4F122D80C54D474001A5BF33D7367D43087AFAD4C6244DFC653FED91DA6E2480899026303315D1AD4B522D140DAA4737ABDA60B52EC82CDDB60299\"}").getAsJsonObject();
        jsonObject.addProperty("page",page);
        Observable<JsonMVListRecomm> result = mRepositoryManager.obtainRetrofitService(CommonService.class)
                .apiMvListRecommend(jsonObject );
        return result;
    }
}