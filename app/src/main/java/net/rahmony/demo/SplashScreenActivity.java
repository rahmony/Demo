package net.rahmony.demo;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {
    private Thread splashThread;
    private int splashTime = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

          //No title Bar :)
         // requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Full Screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 0);

        setContentView(R.layout.activity_splash_screen);

        splashThread = new Thread() {

            public void run() {
                try {
                    synchronized (this) {
                        wait(splashTime);
                    }
                } catch (Exception e) {

                } finally {
                    finish();
                    Intent i = new Intent();
                    i.setClass(getApplicationContext(), LoginActivity.class);
                    startActivity(i);
                }
            }
        };
        splashThread.start();
    }





}
