package com.androindian.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences preferences=getSharedPreferences("Login",MODE_PRIVATE);
                String s1=preferences.getString("Pass",null);
                String s2=preferences.getString("Mobile",null);

                if(s1==null && s2==null){
                    Intent intent=new Intent(Splash.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Intent intent=new Intent(Splash.this,Menupage.class);
                    startActivity(intent);
                    finish();
                }

            }
        },3000);
    }
}
