package com.buildo.application.intro;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.buildo.application.R;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        FragmentManager manager = getSupportFragmentManager();

        IntroFragment introFragment = new IntroFragment();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.relativeLayoutIntro, introFragment, "introFragment");
        transaction.commit();

    }

}
