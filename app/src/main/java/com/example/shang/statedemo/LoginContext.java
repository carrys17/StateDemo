package com.example.shang.statedemo;

import android.content.Context;

/**
 * Created by shang on 2017/11/5.
 */


// UML 中的Context 类
public class LoginContext {
    // 默认为未登录状态
    UserState userState = new LogoutState();
    // 单例
    static LoginContext sLoginContext = new LoginContext();

    private LoginContext(){

    }

    public static LoginContext getLoginContext(){
        return sLoginContext;
    }

    public void setState(UserState state){
        userState = state;
    }

    // 转发
    public void forward(Context context){
        userState.forward(context);
    }

    // 评论
    public void comment(Context context){
        userState.comment(context);
    }


}
