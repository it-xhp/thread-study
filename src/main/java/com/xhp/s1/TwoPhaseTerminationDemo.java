package com.xhp.s1;

import lombok.extern.slf4j.Slf4j;

import static com.xhp.s1.Sleeper.sleep;

/**
 * @author XHP
 * @version 1.0
 * @date 2022/8/29
 */
public class TwoPhaseTerminationDemo {
    public static void main(String[] args) throws InterruptedException {
        TwoPhaseTermination.start();
        Thread.sleep(5000);
        TwoPhaseTermination.stop();
    }
}

@Slf4j
class TwoPhaseTermination {
    private static Thread monitor;

    public static void start() {
        monitor = new Thread(() -> {
            while (true) {
                Thread currentThread = Thread.currentThread();
                if (currentThread.isInterrupted()) {
                    log.debug("料理后事了");
                    break;
                }
                log.info("监控中...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    currentThread.interrupt();

                }
            }
        });
        monitor.start();
    }

    public static void stop() {
        monitor.interrupt();
    }
}