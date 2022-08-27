package com.xhp.s1;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author XHP
 * @version 1.0
 * @date 2022/8/27
 */
@Slf4j
public class Test3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                log.debug("running");
                Thread.sleep(200);
                return 100;
            }
        });
        Thread t = new Thread(task);
        t.start();
        log.debug("{}",task.get());


        Callable<Integer> task2 = new Test4();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task2);
        Thread thread = new Thread(futureTask);
        thread.start();
        log.debug("{}",futureTask.get());
    }
}
@Slf4j
class Test4 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        log.debug("running");
        return 1000;
    }
}
