package com.lz.uav;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.lz.base.base.BaseActivity;
import com.lz.base.model.Phones;
import com.lz.base.router.RounterBus;
import com.lz.base.test.RouterA;
import com.lz.setting.entrance.SettingActivity;

public class MainActivity extends BaseActivity {


    private TextView login;
    private TextView setting;

    @Override
    protected void initView(Bundle savedInstanceState) {

        login = findViewById(R.id.login);
        setting = findViewById(R.id.setting);

        login.setOnClickListener(v -> {
            Intent intent = RounterBus.getRounter(RouterA.class).getIntentActivityA("heihei", 23, new Phones());
            if (intent != null) {
                MainActivity.this.startActivity(intent);
            }
        });
        setting.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, SettingActivity.class)));
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }
}
