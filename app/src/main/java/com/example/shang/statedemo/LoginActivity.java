package com.example.shang.statedemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
                finish();
            }
        });
    }

    private void login() {
        if ("carrys17".equals(username.getText().toString().trim()) &&
                "123456".equals(password.getText().toString().trim())){
            LoginContext.getLoginContext().setState(new LoginedState());
            Toast.makeText(getApplicationContext(),"登录成功!",Toast.LENGTH_SHORT).show();
        }
    }

}
