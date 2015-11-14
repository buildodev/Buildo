package com.buildo.application.build.cpu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.buildo.application.R;

public class ProcessorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_processor);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_actionbar));

        ProcessorBrandFragment fragment = new ProcessorBrandFragment();
        getFragmentManager().beginTransaction().replace(R.id.relativeLayoutProcessor, fragment,"brandFragment").commit();
    }
}
