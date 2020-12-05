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
import com.kldbj.ajks.app.bean.JsonNangua;
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
    //    token=d26bf87c3a75c951f12f3743b6195c40&token_id=12824744&phone_type=1&versions_code=1401&request_key=DFB426E40904649CAD89334B481FA89EF1C5224BDCFDBC94C6AD5431CE8EA10E86273E5BA42657D520F2242BDE9F9896470AFC6F012637E66A613FCC8EEC1D8E9CD839BEB7F596E664F0F77D0A40CC3063398ACF569E4E505322B1F3DBBACEDDF8C1F5D14D850F68C7BC3301C615EB298D7DF74A99FEA6DB5AF911A5BD7E5D3099B5BE53FB883425B98579B02FB9C42FF207AE9F55FDB0576A0118DF5EFABE67C2C7152839594E6D128944208252C929DD4FBF4C923233DBF3E64CC9E254E02208B54AB0D771F197990A63D372440F180F6BD2FF8047FD67355848D857B2EBF9&app_id=1&ad_version=1

    @Override
    public Observable<JsonNangua> getPlayUrl(String  requestKey) {
        String body="token=d26bf87c3a75c951f12f3743b6195c40&token_id=12824744&phone_type=1&versions_code=1401&request_key="+requestKey+"&app_id=1&ad_version=1";
        Observable<JsonNangua> result = mRepositoryManager.obtainRetrofitService(CommonService.class)
                .apiPlayUrl(body );
        return result;
    }
//    token=d26bf87c3a75c951f12f3743b6195c40&token_id=12824744&phone_type=1&versions_code=1401&request_key=EBCBE2AA8A48856D49BE4500FB7ED276384106AC01368A5A84E4687A0A0869AE6A8D8CD4AFC6210CE608C758BBFB0FFF87E711D99CB404AC6BDE7B37B389EEB74F37184EDA2B660632C2D54728E94ED1035A39E5BB943A522502BA77962CA6EEA13BE734E915A9751F814F4FDF547782FE68CBD28A6EB5E2E7A4E1904604F582&app_id=1&ad_version=1

//    token=e2c797fdc72998569eadc09b74ab9e41&token_id=93446681&phone_type=1&versions_code=1401&request_key=8B5FF9864CAC68E3CF21BD77B45F1CFBA4F769EF3786D1B808C0B5F3624C0A4EC72D48EFB05153B89C0683F457DEC958186A814132AB6DB8C3A3115BCB8BE6B022497EF11946ABE9D2E6874CF724D971E1EFA118942905BA7F2E13F5A3904A93C62CB470AD7BCC77621F1CD298095D36A0970060DB53148C5C9CC7E626DBA955&app_id=1&ad_version=1
    @Override
    public Observable<JsonNangua> getUserInfo(String request_key) {
        String body="token=e2c797fdc72998569eadc09b74ab9e41&token_id=93446681&phone_type=1&versions_code=1401&request_key=8B5FF9864CAC68E3CF21BD77B45F1CFBA4F769EF3786D1B808C0B5F3624C0A4EC72D48EFB05153B89C0683F457DEC958186A814132AB6DB8C3A3115BCB8BE6B022497EF11946ABE9D2E6874CF724D971E1EFA118942905BA7F2E13F5A3904A93C62CB470AD7BCC77621F1CD298095D36A0970060DB53148C5C9CC7E626DBA955&app_id=1&ad_version=1";

        Observable<JsonNangua> result = mRepositoryManager.obtainRetrofitService(CommonService.class)
                .apiUserInfo(body );
        return result;
    }

}