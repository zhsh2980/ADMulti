package com.bro.admultilibrary;

import android.app.Application;

import com.blankj.utilcode.util.Utils;
import com.umeng.commonsdk.UMConfigure;

/**
 * Created by zhangshan on 2019-06-17 18:46.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        UMConfigure.init(this, "5ce947420cafb23dee000572", "Tencent_AD", UMConfigure.DEVICE_TYPE_PHONE, null);
    }


}
