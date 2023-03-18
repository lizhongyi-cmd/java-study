package demo.study.thread;

class RunnableDemo implements Runnable {

    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);

        try {
            for(int i = 4; i > 0; i--){
                System.out.println("Thread:" + threadName + "," + i);
                Thread.sleep(50);
            }
        }catch (Exception e){
            System.out.println("thread " + threadName + ":" + e);
        }

    }

    public void start(){
        System.out.println("starting " + threadName);
        if(t == null ){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}

public class threadDemo {
    //多线程练习
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("thread-1");
        r1.start();
        RunnableDemo r2 = new RunnableDemo("thread-2");
        r2.start();

        Thread t1 = new Thread( r1);
        t1.start();

    }
}
