package com.lz.base.app;

import android.app.Application;

/**
 * Created by liuzhao on 2018/3/9.
 */

public class BaseApplication extends Application implements ApplicationAsLibrary {
    @Override
    public void onCreate() {
        super.onCreate();
        onCreateAsLibrary(this);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        onLowMemoryAsLibrary(this);
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        onTrimMemoryAsLibrary(this, level);
    }

    @Override
    public void onCreateAsLibrary(Application application) {

    }

    @Override
    public void onLowMemoryAsLibrary(Application application) {

    }

    @Override
    public void onTrimMemoryAsLibrary(Application application, int level) {

    }
}
