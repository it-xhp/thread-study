package com.xhp.s1;

import lombok.extern.slf4j.Slf4j;

import static com.xhp.s1.Sleeper.sleep;

/**
 * @author XHP
 * @version 1.0
 * @date 2022/8/29
 */
@Slf4j
public class TestJoin {
    static int r1 = 0;
    ;
    static int r2 = 0;
    ;

    public static void main(String[] args) throws InterruptedException {
        test3();
    }

    public static void test3() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            sleep(2);
            r1 = 10;
        });
        t1.start();
        log.debug("join begin");
        t1.join(1500);
        //t1.join(3000);超过睡眠时间，则睡眠停止后也不等了
        log.debug("r1:{} r2:{}", r1, r2);

    }
}
