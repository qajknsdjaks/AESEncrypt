package com.kldbj.ajks.player.di.component;

import dagger.BindsInstance;
import dagger.Component;
import com.jess.arms.di.component.AppComponent;

import com.kldbj.ajks.player.mvp.contract.PlayVideoContract;
import com.kldbj.ajks.player.mvp.ui.activity.PlayVideoActivity;
import com.kldbj.ajks.player.di.module.PlayVideoModule;
import com.kldbj.ajks.player.mvp.contract.PlayVideoContract;

import com.jess.arms.di.scope.ActivityScope;
import com.kldbj.ajks.player.mvp.ui.activity.PlayVideoActivity;   


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
@ActivityScope
@Component(modules = PlayVideoModule.class, dependencies = AppComponent.class)
public interface PlayVideoComponent {
    void inject(PlayVideoActivity activity);
    @Component.Builder
    interface Builder {
        @BindsInstance
        PlayVideoComponent.Builder view(PlayVideoContract.View view);
        PlayVideoComponent.Builder appComponent(AppComponent appComponent);
        PlayVideoComponent build();
    }
}