package com.example.shang.statedemo;

import android.content.Context;

/**
 * Created by shang on 2017/11/5.
 */

// 抽象状态
public interface UserState {
    //  转发
    void forward(Context context);
    // 评论
    void comment(Context context);
}
