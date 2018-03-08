package com.lz.login;

import android.os.Bundle;
import android.widget.TextView;

import com.lz.base.base.BaseActivity;

/**
 * Created by liuzhao on 2018/3/9.
 */

public class LoginActivity extends BaseActivity {

    private TextView tv;

    @Override
    protected void initView(Bundle savedInstanceState) {
        tv = findViewById(R.id.tv);
        tv.setOnClickListener(v -> showToast("我是登录页面"));
        showToast("LoginActivity");
    }

    @Override
    protected int getLayout() {
        return R.layout.login_activity_main;
    }
}
