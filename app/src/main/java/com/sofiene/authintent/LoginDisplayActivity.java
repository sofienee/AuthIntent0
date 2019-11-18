package com.sofiene.authintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class LoginDisplayActivity extends AppCompatActivity {
    final String EXTRA_LOGIN="USER_LOGIN";
    final String EXTRA_PASSWORD="USER_PASSWORD";
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_display);
        Intent intentv2 =getIntent();

       TextView loginDisplay=findViewById(R.id.email_display);
        TextView passwordDisplay=findViewById(R.id.password_display);
        if (intentv2 !=null)
        {
            loginDisplay.setText((intentv2.getStringExtra(EXTRA_LOGIN)));
            passwordDisplay.setText((intentv2.getStringExtra(EXTRA_PASSWORD)));
        }
    }}