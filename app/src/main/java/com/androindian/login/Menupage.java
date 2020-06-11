package com.androindian.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.androindian.login.databinding.ActivityMenupageBinding;

public class Menupage extends AppCompatActivity {

    ActivityMenupageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(Menupage.this,R.layout.activity_menupage);

        SharedPreferences preferences=getSharedPreferences("Login",MODE_PRIVATE);
        String s1=preferences.getString("Pass",null);
        String s2=preferences.getString("Mobile",null);


        Toast.makeText(this, ""+s1+s2, Toast.LENGTH_SHORT).show();

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences=getSharedPreferences("Login",MODE_PRIVATE);
                SharedPreferences.Editor editor=preferences.edit();
                editor.clear();
                editor.commit();

            }
        });
    }
}
