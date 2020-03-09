package Bai_Test.Thread.ThreadTest;

public class Main {
    public static void main(String[] args) {
        //tu sinh ra Thread Main
        //Thread main -> luong chinh
        System.out.println("Start");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Thread 1 > " + i);
                }
            }
        });
        t1.start();
        //.start() chay luong
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("T");
            }
        }).start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Thread 2 > " + i);
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                //code
            }
        });
        t3.start();
        t2.start();
        System.out.println("End");
    }
}
