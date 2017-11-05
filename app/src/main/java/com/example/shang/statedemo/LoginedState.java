package com.example.shang.statedemo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by shang on 2017/11/5.
 */

// 登录状态
public class LoginedState implements UserState {
    @Override
    public void forward(Context context) {
        Toast.makeText(context,"转发微博",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void comment(Context context) {
        Toast.makeText(context,"评论微博",Toast.LENGTH_SHORT).show();
    }
}
