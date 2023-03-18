package demo.study.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        //创建线程池

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        TaskRunnable task = new TaskRunnable();

        executorService.submit(task);
        System.out.println("---------------------");

        executorService.submit(task);

        executorService.shutdown();


    }
}
