package com.androindian.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.androindian.login.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);

        binding.save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences=getSharedPreferences("Login",MODE_PRIVATE);
                //edit
                SharedPreferences.Editor editor=preferences.edit();
                //editor.putString("Key","values");
                editor.putString("Pass",binding.pass.getText().toString());
                editor.putString("Mobile",binding.mobile.getText().toString());
                editor.commit();

                Intent intent=new Intent(MainActivity.this,Menupage.class);
                startActivity(intent);
            }
        });
    }
}
