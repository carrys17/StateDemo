package com.example.shang.statedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.zhuanfa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginContext.getLoginContext().forward(MainActivity.this);
            }
        });

        findViewById(R.id.zhuxiao).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginContext.getLoginContext().setState(new LogoutState());
            }
        });
    }
}
