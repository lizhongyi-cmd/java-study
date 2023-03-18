package demo.study.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TaskRunnable implements Runnable{

    Lock l = new ReentrantLock();

    @Override
    public void run(){
        l.lock();
        for(int i = 0; i < 100; i ++){
            System.out.println("自定义线程任务正在实行" + i);
        }
    }
}
