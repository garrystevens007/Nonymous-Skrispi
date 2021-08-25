package com.example.nonymous;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity {

    TextInputLayout et_reg_username, et_reg_fullname, et_reg_pass, et_reg_conpass;
    ImageButton btn_reg_back;
    Button btn_reg_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
        getSupportActionBar().hide();

        btn_reg_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });

        btn_reg_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = et_reg_username.getEditText().toString().trim(),
                        fullname = et_reg_fullname.getEditText().toString().trim(),
                        pass = et_reg_pass.getEditText().toString().trim(),
                        conpass = et_reg_conpass.getEditText().toString().trim();


                //password not equals
                if (!pass.equals(conpass)) {

                }
                insertData(uname,fullname,pass,conpass);
            }
        });
    }

    private void insertData(String username, String fullname, String password, String conpass){

    }


    private void init(){
        et_reg_fullname = findViewById(R.id.et_reg_fullname);
        et_reg_username = findViewById(R.id.et_reg_username);
        et_reg_pass = findViewById(R.id.et_reg_pass);
        et_reg_conpass = findViewById(R.id.et_reg_conpass);
        btn_reg_back = findViewById(R.id.btn_reg_back);
        btn_reg_register = findViewById(R.id.btn_reg_register);
    }

}