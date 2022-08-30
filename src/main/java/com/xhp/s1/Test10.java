package com.xhp.s1;

import lombok.extern.slf4j.Slf4j;

import static com.xhp.s1.Sleeper.sleep;

/**
 * @author XHP
 * @version 1.0
 * @date 2022/8/29
 */
@Slf4j
public class Test10 {
    static int r = 10;

    public static void main(String[] args) throws InterruptedException {
        test1();
    }

    private static void test1() throws InterruptedException {
        log.debug("开始");
        Thread t1 = new Thread(() -> {
            log.debug("开始");
            sleep(1);
            r = 10;
        }, "t1");
        t1.start();
        t1.join();
        log.debug("结果为：{}", r);
        log.debug("结束");
    }
}
