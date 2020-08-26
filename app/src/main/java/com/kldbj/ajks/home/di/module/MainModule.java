package com.kldbj.ajks.home.di.module;

import dagger.Binds;
import dagger.Module;

import com.kldbj.ajks.home.mvp.contract.MainContract;
import com.kldbj.ajks.home.mvp.model.MainModel;
import com.kldbj.ajks.home.mvp.contract.MainContract;
import com.kldbj.ajks.home.mvp.model.MainModel;


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
@Module
public abstract class MainModule {

    @Binds
    abstract MainContract.Model bindMainModel(MainModel model);
}