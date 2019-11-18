package com.sofiene.authintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final String EXTRA_LOGIN="USER_LOGIN";
    final String EXTRA_PASSWORD="USER_PASSWORD";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText user_mail = (EditText) findViewById(R.id.user_email);
        final EditText user_password  = (EditText) findViewById(R.id.user_password);
        Button seConnecter = (Button) findViewById(R.id.connect);


        seConnecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String user = user_mail.getText().toString();
                final String mdp = user_password.getText().toString();

                if (user.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(user).matches()) {
                    Toast.makeText(MainActivity.this, R.string.email_or_password_empty,
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                    else if (mdp.isEmpty() || mdp.length() < 4 || mdp.length() > 10) {

                        Toast.makeText(MainActivity.this, R.string.email_or_password_empty,
                                Toast.LENGTH_SHORT).show();
                    }
                   else {
                    Intent intent = new Intent(MainActivity.this, LoginDisplayActivity.class);
                   intent.putExtra(EXTRA_LOGIN, user);
                    intent.putExtra(EXTRA_PASSWORD, mdp);
                    startActivity(intent);
                }
            }
        });
    }}