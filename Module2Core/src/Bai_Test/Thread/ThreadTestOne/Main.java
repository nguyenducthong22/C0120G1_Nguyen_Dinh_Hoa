package Bai_Test.Thread.ThreadTestOne;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread main start");
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
//        threadTwo.run();
        Thread t = new Thread(threadTwo);
        threadOne.start();
        t.start();
        threadOne.join();
        System.out.println("Join luong 1 vao thread main");

        t.join();
        System.out.println("Join luong 2 vao thread main");
        System.out.println("Thread main stop");
//        Thread.sleep(2000);
//        threadOne.stop();
//        t.stop();

    }
}
