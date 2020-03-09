package Bai_Test.Thread.ThreadTestOne;

public class MainJoinThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread main start");
        ThreadOne t1 = new ThreadOne();
        Thread t2 = new Thread(new ThreadTwo(t1));

        t1.start();
        t2.start();
        t2.join();


        System.out.println("Thread main stop");
    }
}
