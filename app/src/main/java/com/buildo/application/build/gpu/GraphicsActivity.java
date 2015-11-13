package com.buildo.application.build.gpu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.buildo.application.R;

public class GraphicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphics);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_actionbar));

        GraphicsBrandFragment fragment = new GraphicsBrandFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.relativeLayoutGraphics, fragment, "brandFragment").commit();
    }
}
