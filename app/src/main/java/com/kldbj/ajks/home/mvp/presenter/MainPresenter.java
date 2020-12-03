package com.kldbj.ajks.home.mvp.presenter;

import android.app.Application;

import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import me.jessyan.rxerrorhandler.handler.RetryWithDelay;

import javax.inject.Inject;

import com.kldbj.ajks.app.bean.JsonNangua;
import com.kldbj.ajks.home.mvp.contract.MainContract;

import java.security.MessageDigest;
import java.util.Date;


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
public class MainPresenter extends BasePresenter<MainContract.Model, MainContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    @Inject
    public MainPresenter(MainContract.Model model, MainContract.View rootView) {
        super(model, rootView);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
    }

    public void getPlayUrl() {
        //    token=d26bf87c3a75c951f12f3743b6195c40&token_id=12824744&phone_type=1&versions_code=1401
        //    &request_key=DFB426E40904649CAD89334B481FA89EF1C5224BDCFDBC94C6AD5431CE8EA10E86273E5BA42657D520F2242BDE9F9896470AFC6F012637E66A613FCC8EEC1D8E9CD839BEB7F596E664F0F77D0A40CC3063398ACF569E4E505322B1F3DBBACEDDF8C1F5D14D850F68C7BC3301C615EB298D7DF74A99FEA6DB5AF911A5BD7E5D3099B5BE53FB883425B98579B02FB9C42FF207AE9F55FDB0576A0118DF5EFABE67C2C7152839594E6D128944208252C929DD4FBF4C923233DBF3E64CC9E254E02208B54AB0D771F197990A63D372440F180F6BD2FF8047FD67355848D857B2EBF9
        //    &app_id=1&ad_version=1

        String data ="DFB426E40904649CAD89334B481FA89EF1C5224BDCFDBC94C6AD5431CE8EA10E86273E5BA42657D520F2242BDE9F9896470AFC6F012637E66A613FCC8EEC1D8E9CD839BEB7F596E664F0F77D0A40CC3063398ACF569E4E505322B1F3DBBACEDDF8C1F5D14D850F68C7BC3301C615EB298D7DF74A99FEA6DB5AF911A5BD7E5D3099B5BE53FB883425B98579B02FB9C42FF207AE9F55FDB0576A0118DF5EFABE67C2C7152839594E6D128944208252C929DD4FBF4C923233DBF3E64CC9E254E02208B54AB0D771F197990A63D372440F180F6BD2FF8047FD67355848D857B2EBF9";
        String decrypt = e.d(data, "8jhM5h6dezq4QifP", "tho3aAHJyZCWAfTG");
//                {"token_id":"12824744","ns":"ab4c3164e16f32c9d5cb1dd3cddf700b","nt":"1606982283","mobile_key":"3a6855049a772052a8b09f1bd03dc2e9","vod_id":"151474","mobile_time":"1606982283","token":"d26bf87c3a75c951f12f3743b6195c40"}
        String encrypt = e.f(decrypt, "8jhM5h6dezq4QifP", "tho3aAHJyZCWAfTG");


        System.out.println("decrypt----->"+decrypt);
        System.out.println("encrypt----->"+encrypt);

        String nt = "1606982283";
        String ns = getMD5("com.pumpkinteam.pumpkinplayer96D89D9AC7A9AA1AF6F634ED4463AAE5E7798C45C2C606CAB00CA73DA8A1005A&z4Y!s!2br"+nt).toLowerCase();
        System.out.println("ns----->"+ ns);

        String str = "{\"token_id\":\"12824744\",\"ns\":\""+ns+"\",\"nt\":\""+nt+"\",\"mobile_key\":\"3a6855049a772052a8b09f1bd03dc2e9\",\"vod_id\":\"151474\",\"mobile_time\":\"1606982283\",\"token\":\"d26bf87c3a75c951f12f3743b6195c40\"}";

        String request_key = e.f(str, "8jhM5h6dezq4QifP", "tho3aAHJyZCWAfTG");

        System.out.println("request_key"+request_key);


        if (false)
        mModel.getPlayUrl( request_key )
                .subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(3, 2))
                .doOnSubscribe(disposable -> {
                    mRootView.showLoading(new Date().toString());
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ErrorHandleSubscriber<JsonNangua>(mErrorHandler) {
                    @Override
                    public void onError(@NonNull Throwable e) {
                        mRootView.hideLoading();
                        mRootView.showMessage(e.getMessage());
                    }

                    @Override
                    public void onNext(@NonNull JsonNangua result) {
                        mRootView.hideLoading();
                        if (result.getCode() == 200){
                            String decrypt = e.d(result.getData().getResponse_key(), "8jhM5h6dezq4QifP", "tho3aAHJyZCWAfTG");
                            mRootView.showMessage(decrypt);
                        }else {
                            mRootView.showMessage(result.getCode()+result.getMsg());
                        }


                    }
                });
        mModel.getUserInfo( "" )
                .subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(3, 2))
                .doOnSubscribe(disposable -> {
                    mRootView.showLoading(new Date().toString());
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ErrorHandleSubscriber<JsonNangua>(mErrorHandler) {
                    @Override
                    public void onError(@NonNull Throwable e) {
                        mRootView.hideLoading();
                        mRootView.showMessage(e.getMessage());
                    }

                    @Override
                    public void onNext(@NonNull JsonNangua result) {
                        mRootView.hideLoading();
                        if (result.getCode() == 200){
                            String decrypt = e.d(result.getData().getResponse_key(), "8jhM5h6dezq4QifP", "tho3aAHJyZCWAfTG");
                            mRootView.showMessage(decrypt);
                        }else {
                            mRootView.showMessage(result.getCode()+result.getMsg());
                        }


                    }
                });
    }
    public String getMD5(String data) {
        char hexDigits[] = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
        };
        try {
            byte[] btInput = data.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            return null;
        }
    }
}
