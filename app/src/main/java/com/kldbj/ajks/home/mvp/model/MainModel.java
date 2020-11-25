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
import com.kldbj.ajks.app.bean.UserInfo;
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
    public Observable<UserInfo> getJJKKTokenJson() {
//        https://apid.bdxqhzs.com/s1/register/uuid/d30a10e0ed84d1cf?model=Xiaomi MI MAX 3&platform=android&key=e92c2fdb23428aa09f7a5e05bd879db6f0c62622936cea0f7de8b427a3d24689&version=3.9.2&lang=CN
        String host = "YXBpZC5iZHhxaHpzLmNvbQ==";
        host =  new String(Base64.decode(host.getBytes(), Base64.DEFAULT));
//      String url = "https://"+host+"/s1/register/uuid/d30a10e0ed84d1cf?model=Xiaomi MI MAX 3&platform=android&key=e92c2fdb23428aa09f7a5e05bd879db6f0c62622936cea0f7de8b427a3d24689&version=3.9.2&lang=CN";
 //       String url = "https://apid.dgzytop.com/s1/register/uuid/d30a10e0ed84d1cf?model=Xiaomi MI MAX 3&platform=android&key=e92c2fdb23428aa09f7a5e05bd879db6f0c62622936cea0f7de8b427a3d24689&version=3.9.2&lang=CN";
        String url = "http://api.tbrapi.com:8080/api.php/api/user/userinfo?timestamp=1606296743&data=F4E540360B85E9CD70330F50955EF83FAC16D2975C7D779AC42E911A809390BB77D493E3B8ED070F0978529198137555FDCFC372BA248860AA85C40880184151DB86C196EF017D9015E919E7ED02268D71BBCD95D31EEFF4941C355D941751F0E73D8DB89360B0078BE1263D6D212417650D5CCA043E57735C3B20DF72B3EFEA66A99C24D8677360C8854E859506638DCEDFDD26EA84A46D3EFD0E900CC94AF4F9E3CC4921CF902ADEB7707A9B298374E3399D00DB8AFCE64CCFECFC28E298D8A28627B376E4FD0C5BE2360C2DF0F3802F8833C93068D56C6832307B0BA7B700F77AB344D9E6E4A71D3FB3186A5DF30E2B60B278DB5ED744FE70FA547F52BE3D4901E33D392503905849BC270E7C0A0D6FDE1BE0EEBFBA61B8E5D73E8C55C8BBAB2637EF6AAAB5286D0A01895E75DA9CAC148B157F36D637F88E7213E4295E1503EE062625CFB73CF82033EF0E63B8DFCF07515E01897299651ABBE3D2695146976DB86DA3BFF297BF2D05E91254DC8DC3A6952FAAFB13E353AD482C699A56AB4C4A7A7AD0DBA4797A28ED56235458D0D0AA5936CB6A698AE804734A32A8A7D5FAC9E1&sign=1075669cca1db9995fb372b567c6e7b4";
        Observable<UserInfo> result = mRepositoryManager.obtainRetrofitService(CommonService.class)
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