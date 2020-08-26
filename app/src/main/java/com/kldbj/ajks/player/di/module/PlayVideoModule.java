package com.kldbj.ajks.player.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import com.kldbj.ajks.player.mvp.contract.PlayVideoContract;
import com.kldbj.ajks.player.mvp.model.PlayVideoModel;
import com.kldbj.ajks.player.mvp.contract.PlayVideoContract;
import com.kldbj.ajks.player.mvp.model.PlayVideoModel;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 08/25/2020 15:12
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@Module
public abstract class PlayVideoModule {

    @Binds
    abstract PlayVideoContract.Model bindPlayVideoModel(PlayVideoModel model);
}