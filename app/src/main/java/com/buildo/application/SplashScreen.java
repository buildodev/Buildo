package com.buildo.application;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;

import com.buildo.application.build.RigHomeActivity;
import com.buildo.application.intro.IntroActivity;
import com.buildo.application.main.MainActivity;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "com.buildo.application",
                    PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                System.out.println("KeyHash : " + Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        Thread background = new Thread() {
            public void run() {

                try {
                    sleep(2 * 1000);

                    startActivity(new Intent(SplashScreen.this, RigHomeActivity.class)); //IntroActivity.class

                    finish();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        background.start();

    }

}
