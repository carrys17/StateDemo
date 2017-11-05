package com.example.shang.statedemo;

import android.content.Context;
import android.content.Intent;

/**
 * Created by shang on 2017/11/5.
 */

// 注销状态
public class LogoutState implements UserState {
    @Override
    public void forward(Context context) {
        gotoLoginActivity(context);
    }


    @Override
    public void comment(Context context) {
        gotoLoginActivity(context);
    }

    private void gotoLoginActivity(Context context) {
        Intent intent = new Intent(context,LoginActivity.class);
        context.startActivity(intent);
    }

}
