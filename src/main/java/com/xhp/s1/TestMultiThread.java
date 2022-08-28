package com.xhp.s1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author XHP
 * @version 1.0
 * @date 2022/8/28
 */
@Slf4j
public class TestMultiThread {
    public static void main(String[] args) {
        new Thread(() -> {
            while (true){
                log.debug("running");
            }
        },"t1").start();

        new Thread(() -> {
            while (true){
                log.debug("running");
            }
        },"t2").start();
    }
}
