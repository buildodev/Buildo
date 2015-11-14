package com.buildo.application.build.psu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.buildo.application.R;

public class PowerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_actionbar));

        PowerOptionsFragment fragment = new PowerOptionsFragment();
        getFragmentManager().beginTransaction().replace(R.id.relativeLayoutPower, fragment, "powerOptionsFragment").commit();
    }
}
