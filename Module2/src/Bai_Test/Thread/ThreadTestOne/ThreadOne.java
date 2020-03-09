package Bai_Test.Thread.ThreadTestOne;

public class ThreadOne extends Thread {
    @Override
    public void run() {
        System.out.println("t1 is running");
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 : "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
