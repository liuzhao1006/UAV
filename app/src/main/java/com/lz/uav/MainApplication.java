package com.lz.uav;

import android.app.Application;

import com.lz.base.app.AppContext;
import com.lz.base.app.ApplicationAsLibrary;
import com.lz.setting.app.SettingApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuzhao on 2018/3/9.
 */

public class MainApplication extends Application {
    private List<ApplicationAsLibrary> mChildApplicationList = new ArrayList<>();

    @Override public void onCreate() {
        super.onCreate();
        AppContext.init(getApplicationContext());
        mChildApplicationList.add(new SettingApplication());


        for (ApplicationAsLibrary app : mChildApplicationList) {
            app.onCreateAsLibrary(this);
        }
    }

    @Override public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        for (ApplicationAsLibrary app : mChildApplicationList) {
            app.onTrimMemoryAsLibrary(this, level);
        }
    }

    @Override public void onLowMemory() {
        super.onLowMemory();
        for (ApplicationAsLibrary app : mChildApplicationList) {
            app.onLowMemoryAsLibrary(this);
        }
    }
}
