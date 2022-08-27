package com.xhp.s1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author XHP
 * @version 1.0
 * @date 2022/8/27
 */
@Slf4j
public class Test2 {
    public static void main(String[] args) {
        test2();
        Thread t2 = new Thread(() -> {
            log.debug("running");
        }, "t2");
        t2.start();
    }

    public static void test2() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                log.debug("running");
            }
        };
        Thread t2 = new Thread(r, "t2");
        t2.start();
    }
}

