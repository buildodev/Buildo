package com.buildo.application.build.mobo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.buildo.application.R;

public class MotherboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motherboard);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_actionbar));
    }
}
