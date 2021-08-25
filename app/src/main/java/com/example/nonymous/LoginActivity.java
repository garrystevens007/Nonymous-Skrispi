package com.example.nonymous;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    TextInputLayout et_username, et_password;
    Button btn_login;
    TextView tv_register_here;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        getSupportActionBar().hide();


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = et_username.getEditText().getText().toString().trim(),
                        pwd = et_password.getEditText().getText().toString().trim();
                //cek
                //test
                //ppp
//                if(uname.trim().isEmpty()){
//                    et_password.setErrorEnabled(true);
//                    return;
//                }
//                if(pwd.trim().isEmpty()){
//                    et_password.setErrorEnabled(true);
//                    return;
//                }
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
                finish();
                Log.d("Tester", "onCreate: username :" + uname + ", password :" + pwd );
            }
        });

    }

    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.tv_register_here:
                i = new Intent(this, RegisterActivity.class);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
        startActivity(i);
        finish();
    }



    private void init(){
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);
    }

}