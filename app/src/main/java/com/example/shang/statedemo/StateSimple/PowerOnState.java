package com.example.shang.statedemo.StateSimple;

/**
 * Created by shang on 2017/11/5.
 */

// 开机状态，此时可以跳转等操作
public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("跳转到下一个频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("跳转到上一个频道");
    }

    @Override
    public void turnUp() {
        System.out.println("增加音量");
    }

    @Override
    public void turnDown() {
        System.out.println("减低音量");
    }
}
