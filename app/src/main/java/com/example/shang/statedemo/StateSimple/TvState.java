package com.example.shang.statedemo.StateSimple;

/**
 * Created by shang on 2017/11/5.
 */

// 状态接口
public interface TvState {
    void nextChannel();
    void prevChannel();
    void turnUp();
    void turnDown();
}
