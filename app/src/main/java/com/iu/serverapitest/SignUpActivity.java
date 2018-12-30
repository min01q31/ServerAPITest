package com.iu.serverapitest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends BaseActivity {

    private android.widget.EditText userIDEdt;
    private android.widget.EditText userPWEdt;
    private android.widget.EditText userPWCheckEdt;
    private android.widget.EditText userNameEdt;
    private android.widget.EditText userEmailEdt;
    private android.widget.EditText userPhoneEdt;
    private android.widget.Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        bindViews();
        setupEvents();
        setValues();

    }

    @Override
    public void setupEvents() {
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userIDEdt.getText().toString().equals("")){
                    Toast.makeText(mContext, "아이디를 입력하세요", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });

        if (userIDEdt.getText().toString().length() < 6){
            Toast.makeText(mContext, "아이디는 6글자 이상이어야 합니다.", Toast.LENGTH_SHORT).show();
            return;
        }

        if(userPWEdt.getText().toString().length()<8){
            Toast.makeText(mContext, "비밀번호는 8글자 이상이어야 합니다.", Toast.LENGTH_SHORT).show();
            return;
        }
        if(!userPWEdt.getText().toString().equals(userPWCheckEdt.getText().toString())){
            Toast.makeText(mContext, "비밀번호가 서로 다릅니다.", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.signUpBtn = (Button) findViewById(R.id.signUpBtn);
        this.userPhoneEdt = (EditText) findViewById(R.id.userPhoneEdt);
        this.userEmailEdt = (EditText) findViewById(R.id.userEmailEdt);
        this.userNameEdt = (EditText) findViewById(R.id.userNameEdt);
        this.userPWCheckEdt = (EditText) findViewById(R.id.userPWCheckEdt);
        this.userPWEdt = (EditText) findViewById(R.id.userPWEdt);
        this.userIDEdt = (EditText) findViewById(R.id.userIDEdt);
    }
}
