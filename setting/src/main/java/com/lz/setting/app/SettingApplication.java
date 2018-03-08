package com.lz.setting.app;

import android.app.Application;

import com.lz.base.app.AppContext;
import com.lz.base.app.BaseApplication;
import com.lz.base.function.Function;
import com.lz.base.function.FunctionBus;

/**
 * Created by liuzhao on 2018/3/9.
 */

public class SettingApplication extends BaseApplication {
    @Override public void onCreate() {
        super.onCreate();
        //给底层library设置context
        AppContext.init(getApplicationContext());
    }

    /**
     * 作为library时需要初始化的内容
     */
    @Override public void onCreateAsLibrary(Application application) {
        super.onCreateAsLibrary(application);
        //给FunctionBus传入已实现的公开方法的实例
        FunctionBus.setFunction((Function) key -> "xixi");
    }
}
