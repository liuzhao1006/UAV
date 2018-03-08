package com.lz.setting.entrance;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import com.lz.base.base.BaseActivity;
import com.lz.setting.R;
import com.lz.setting.app.RounterEntry;
import com.squareup.picasso.Picasso;

/**
 * Created by liuzhao on 2018/3/9.
 */

public class SettingActivity extends BaseActivity {

    private TextView tv;

    @Override
    protected void initView(Bundle savedInstanceState) {
        tv = findViewById(R.id.tv);
        tv.setOnClickListener(v -> RounterEntry.startActivityB(SettingActivity.this));
        ViewPager.class.getName();
        Picasso.class.getName();
        showToast("SettingActivity");
    }

    @Override
    protected int getLayout() {
        return R.layout.setting_activity_main;
    }
}
