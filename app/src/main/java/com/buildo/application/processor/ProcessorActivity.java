package com.buildo.application.processor;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.buildo.application.R;

public class ProcessorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_processor);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_actionbar));

        FragmentManager manager = getSupportFragmentManager();

        ManufacturerFragment manufacturerFragment = new ManufacturerFragment();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.relativeLayoutProcessor, manufacturerFragment, "manufacturerFragment");
        transaction.commit();

    }
}
