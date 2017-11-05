package com.example.shang.statedemo.StateSimple;

/**
 * Created by shang on 2017/11/5.
 */

// 客户端调用代码
public class Client {
    public static void main(String []args){
        TvController controller = new TvController();
        controller.powerOn();
        controller.nextChannel();
        controller.prevChannel();
        controller.turnUp();

        // 设置为关机状态后，不会调低音量了
        controller.powerOff();
        controller.turnDown();
    }
}
