package com.xhp.s1;

/**
 * @author XHP
 * @version 1.0
 * @date 2022/8/29
 */
public class Sleeper {
    public static void sleep(int minute) {
        try {
            Thread.sleep(minute * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
