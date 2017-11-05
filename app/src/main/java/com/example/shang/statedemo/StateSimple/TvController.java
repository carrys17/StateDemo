package com.example.shang.statedemo.StateSimple;

/**
 * Created by shang on 2017/11/5.
 */

// 电视遥控器。是UML图中的Context 角色
public class TvController implements PowerController{
    private TvState mState;
    public void setmState(TvState state){
        mState = state;
    }

    @Override
    public void powerOn() {
        setmState(new PowerOnState());
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        setmState(new PowerOffState());
        System.out.println("关机啦");
    }

    public void nextChannel(){
        mState.nextChannel();
    }

    public void prevChannel(){
        mState.prevChannel();
    }

    public void turnUp(){
        mState.turnUp();
    }

    public void turnDown(){
        mState.turnDown();
    }
}
