package com.lz.login;

import android.app.Application;

import com.lz.base.app.AppContext;
import com.lz.base.app.BaseApplication;

/**
 * Created by liuzhao on 2018/3/9.
 */

public class LoginApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        AppContext.init(getApplicationContext());
    }

    @Override
    public void onCreateAsLibrary(Application application) {
        super.onCreateAsLibrary(application);
    }
}
