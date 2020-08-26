package com.kldbj.ajks.app;


import com.jess.arms.base.BaseApplication;

public class MyApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        EncryptManager.getInstance().init("132f1537f85scxpcm59f7e318b9epa51", "e79465cfbb39ckcusimcuekd3b066a6e");
    }
}
