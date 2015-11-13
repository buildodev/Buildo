package com.buildo.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.buildo.application.build.cpu.ProcessorActivity;
import com.buildo.application.build.gpu.GraphicsActivity;

public class RigHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rig_home);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_actionbar));
    }

    public void openProcessorActivity(View view) {
        startActivity(new Intent(RigHomeActivity.this, ProcessorActivity.class));
    }

    public void openGraphicsActivity(View view) {
        startActivity(new Intent(RigHomeActivity.this, GraphicsActivity.class));
    }
}
