package com.kldbj.ajks.home.mvp.presenter;

import android.app.Application;

import com.alibaba.fastjson.JSON;
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

import com.kldbj.ajks.home.mvp.bean.JsonMVListRecomm;
import com.kldbj.ajks.home.mvp.bean.JsonMVListRecomm;
import com.kldbj.ajks.home.mvp.contract.MainContract;

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
    int page = 1;
    public void getJJKKToken() {

        mModel.getJJKKTokenJson( )
                .subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(3, 2))
                .doOnSubscribe(disposable -> {
                    mRootView.showLoading(new Date().toString());
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ErrorHandleSubscriber<String>(mErrorHandler) {
                    @Override
                    public void onError(@NonNull Throwable e) {
                        mRootView.hideLoading();
                        mRootView.showMessage(e.getMessage());
                    }

                    @Override
                    public void onNext(@NonNull String result) {
                        mRootView.hideLoading();
                       System.out.println(result);
                    }
                });
//        page = 1;
//        mModel.getMvListRecommend(1)
//                .subscribeOn(Schedulers.io())
//                .retryWhen(new RetryWithDelay(3, 2))
//                .doOnSubscribe(disposable -> {
//                    mRootView.showLoading(new Date().toString());
//                })
//                .subscribeOn(AndroidSchedulers.mainThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new ErrorHandleSubscriber<JsonMVListRecomm>(mErrorHandler) {
//                    @Override
//                    public void onError(@NonNull Throwable e) {
//                        mRootView.hideLoading();
//                        mRootView.showMessage(e.getMessage());
//                    }
//
//                    @Override
//                    public void onNext(@NonNull JsonMVListRecomm result) {
//                        mRootView.hideLoading();
//                        mRootView.showMVListRecomm(result.getData().getList());
//                    }
//                });
    }

    public void loadVideoListData() {
        mModel.getMvListRecommend(page++)
                .subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(3, 2))
                .doOnSubscribe(disposable -> {
//                    mRootView.showLoading(new Date().toString());
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ErrorHandleSubscriber<JsonMVListRecomm>(mErrorHandler) {
                    @Override
                    public void onError(@NonNull Throwable e) {
                        mRootView.hideLoading();
                        mRootView.showMessage(e.getMessage());
                    }

                    @Override
                    public void onNext(@NonNull JsonMVListRecomm result) {
                        mRootView.hideLoading();
                        mRootView.showMoreMVListRecomm(result.getData().getList());
                    }
                });
    }
}
