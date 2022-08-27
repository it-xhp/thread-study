package com.xhp.s1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author XHP
 * @version 1.0
 * @date 2022/8/27
 */
@Slf4j
public class Test1 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> log.debug("running"));
        t.setName("t1");
        t.start();
        log.debug("running");


        Thread t2 = new Thread() {
            @Override
            public void run() {
                log.debug("running");
            }
        };
        t2.setName("t1");
        t2.start();
        log.debug("running");
    }
}
