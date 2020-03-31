package com.example.myapplication;

import android.content.Intent;
import android.net.nsd.NsdManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class regActivity extends AppCompatActivity {


    private EditText email,pass,pass2,tel;
    private Button regbutton;
    private Button confirm;
    private regActivity mContext;
    private Object EmailAuthCredential;
    private Object PasswordAuthentication;
    private Object regActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

            mContext = this;

        Button login = (Button) findViewById(R.id.button3);
            EmailAuthCredential = (EditText) findViewById(R.id.email_edittxt);
            PasswordAuthentication = (EditText) findViewById(R.id.password_edittxt);
            regActivity = (TextView) findViewById(R.id.tvregister);

        View mLogin = null;
        assert mLogin != null;
        mLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkLogin();
                }
            });

        View mRegister = null;
        mRegister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, regActivity.class);
                    startActivity(intent);
                }
            });
        }

        private void checkLogin() {

        }
    }

