package com.buildo.application.build.memory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.buildo.application.R;

public class MemoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ram);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_actionbar));

        MemoryOptionsFragment fragment = new MemoryOptionsFragment();
        getFragmentManager().beginTransaction().replace(R.id.relativeLayoutRam, fragment, "ramOptions").commit();
    }
}
