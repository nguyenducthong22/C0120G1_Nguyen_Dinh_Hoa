package Bai_Test.Thread.ThreadTestOne;

public class ThreadTwo implements Runnable {
    ThreadOne t1;
    public ThreadTwo() {
    }

    public ThreadTwo(ThreadOne t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        System.out.println("t2 is running ");
        try {
            System.out.println("Join t1 into t2");
            t1.join();
            System.out.println("t1 Finish");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 11; i < 200000; i++) {
            System.out.println("Thread 2 : " + i);
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
