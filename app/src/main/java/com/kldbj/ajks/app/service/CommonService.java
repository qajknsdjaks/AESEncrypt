package com.kldbj.ajks.app.service;

import com.google.gson.JsonObject;
import com.kldbj.ajks.app.bean.JJKKTokenJson;
import com.kldbj.ajks.app.bean.JsonNangua;
import com.kldbj.ajks.home.mvp.bean.JsonMVListRecomm;

import org.json.JSONObject;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface CommonService {
    @GET
    Observable<JJKKTokenJson> getJJKKTokenJson(@Url String url );

//    POST /api.php/api/MvList/recommend HTTP/1.1
//    Accept-Language: zh-CN,zh;q=0.8
//    User-Agent: Mozilla/5.0 (Linux; U; Android 7.1.2; zh-cn; AOSP on msm8996 Build/NZH54D) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30
//    token: A7591FC748A3756309C6EA3C7FAC4D1531FEAB32AD8F101F4F122D80C54D474001A5BF33D7367D43087AFAD4C6244DFC653FED91DA6E2480899026303315D1AD4B522D140DAA4737ABDA60B52EC82CDDB60299
//    Content-Type: application/json;charset=utf-8
//    Content-Length: 918
//    Host: api.tbrapi.com:8080
//    Connection: Keep-Alive
//    Accept-Encoding: gzip
//
//    {"sign":"8fa290b4ea82f77b6a558e2e868a8de4","data":"F4E540360B85E9CD70330F50955EF83FAC16D2975C7D779AC43A81019F9EA0BCCA9E7B83A60E71CE4BB747DC0E09AFBC3C080686FF592FF478F57845819B2C3E9118FCF4EA63F407F5EFF0F98434CA22FB6F3992C8B3D42977DFD13C5E4536E3C9682446A5439E9A2816537D5923FA0E94249A750816758B1D6CFDC21750F92826361C0D840E37E87A4BA4521CA38368DA4259C9075158B67134BED9AF05AF3BE1DE01AFF4572E7F4A740D849FB4C0A8602782E7E281CDF73A781821607277007BE08681649B419AD4BD0B9F727CFEC195CCC3A279848273D2CB376D611E3F0EE6C44D6CA228E0A5F018FEACC5AC9F4993457E0416CB52C567DEC130232949F90F875B90E28B36DA486A165C0D58CA2035331C1B0F0658EB6B3230F97F141DA81D18D0ACE9A687E5B3D3DB1B901A05FF88829D2238C6DB065F857890D07441266C02210EE43980D3E25053BC843D83811E9B08E7252B0618AF5B656A060FDFE5EE2B05EB396A122D19D9239837B5AD9586D5C510F8A396E8CE0AFF20943E515A38BBA4953A91AA37AADBB52FEC4D842A4C52984D59CC14D5719A5B7D487F3A8199196D44","timestamp":"1598278922"}
    @Headers({"content-type:application/json;charset=utf-8","Accept:application/json",
            "Accept-Language:zh-CN","User-Agent:Mozilla/5.0 (Linux; U; Android 7.1.2; zh-cn; AOSP on msm8996 Build/NZH54D) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30",
            "token:A7591FC748A3756309C6EA3C7FAC4D1531FEAB32AD8F101F4F122D80C54D474001A5BF33D7367D43087AFAD4C6244DFC653FED91DA6E2480899026303315D1AD4B522D140DAA4737ABDA60B52EC82CDDB60299"})
    @POST("http://api.tbrapi.com:8080/api.php/api/MvList/recommend")
    Observable<JsonMVListRecomm> apiMvListRecommend(@Body JsonObject body );


//    http://jk.xgrruyx.cn/App/UserInfo/getUserInfo
//    POST /App/UserInfo/getUserInfo HTTP/1.1
//    Content-Type: application/x-www-form-urlencoded
//    Content-Length: 379
//    Host: jk.xgrruyx.cn
//    Connection: Keep-Alive
//    Accept-Encoding: gzip
//    User-Agent: okhttp/3.12.0
//
//    token=d26bf87c3a75c951f12f3743b6195c40&token_id=12824744&phone_type=1&versions_code=1401&request_key=EBCBE2AA8A48856D49BE4500FB7ED276384106AC01368A5A84E4687A0A0869AE6A8D8CD4AFC6210CE608C758BBFB0FFF87E711D99CB404AC6BDE7B37B389EEB74F37184EDA2B660632C2D54728E94ED1035A39E5BB943A522502BA77962CA6EEA13BE734E915A9751F814F4FDF547782FE68CBD28A6EB5E2E7A4E1904604F582&app_id=1&ad_version=1
    @Headers({"content-type:application/x-www-form-urlencoded" ,"User-Agent:okhttp/3.12.0"})
    @POST("http://jk.xgrruyx.cn/App/UserInfo/getUserInfo")
    Observable<JsonNangua> apiUserInfo(@Body String body );




//    http://jk.xgrruyx.cn/App/IndexPlay/playUrl

//    Content-Type: application/x-www-form-urlencoded
//    Content-Length: 571
//    Host: jk.xgrruyx.cn
//    Connection: Keep-Alive
//    Accept-Encoding: gzip
//    User-Agent: okhttp/3.12.0
//
//    token=d26bf87c3a75c951f12f3743b6195c40&token_id=12824744&phone_type=1&versions_code=1401&request_key=DFB426E40904649CAD89334B481FA89EF1C5224BDCFDBC94C6AD5431CE8EA10E86273E5BA42657D520F2242BDE9F9896470AFC6F012637E66A613FCC8EEC1D8E9CD839BEB7F596E664F0F77D0A40CC3063398ACF569E4E505322B1F3DBBACEDDF8C1F5D14D850F68C7BC3301C615EB298D7DF74A99FEA6DB5AF911A5BD7E5D3099B5BE53FB883425B98579B02FB9C42FF207AE9F55FDB0576A0118DF5EFABE67C2C7152839594E6D128944208252C929DD4FBF4C923233DBF3E64CC9E254E02208B54AB0D771F197990A63D372440F180F6BD2FF8047FD67355848D857B2EBF9&app_id=1&ad_version=1
    @Headers({"content-type:application/x-www-form-urlencoded" ,"User-Agent:okhttp/3.12.0"})
    @POST("http://jk.xgrruyx.cn/App/IndexPlay/playUrl")
    Observable<JsonNangua> apiPlayUrl(@Body String body );

//    POST /App/UserInfo/getUserInfo HTTP/1.1
//    Content-Type: application/x-www-form-urlencoded
//    Content-Length: 379
//    Host: jk.owhasqa.cn
//    Connection: Keep-Alive
//    Accept-Encoding: gzip
//    User-Agent: okhttp/3.12.0
//    token=e2c797fdc72998569eadc09b74ab9e41&token_id=93446681&phone_type=1&versions_code=1401&request_key=&app_id=1&ad_version=1



}
