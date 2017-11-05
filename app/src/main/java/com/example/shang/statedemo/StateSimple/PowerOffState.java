package com.example.shang.statedemo.StateSimple;

/**
 * Created by shang on 2017/11/5.
 */


// 具体状态，关机状态，此时只有开机是有效的
public class PowerOffState implements TvState {
    @Override
    public void nextChannel() {

    }

    @Override
    public void prevChannel() {

    }

    @Override
    public void turnUp() {

    }

    @Override
    public void turnDown() {

    }
}
