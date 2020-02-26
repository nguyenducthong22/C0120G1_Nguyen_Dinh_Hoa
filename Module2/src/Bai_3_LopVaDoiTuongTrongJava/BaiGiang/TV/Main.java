package Bai_3_LopVaDoiTuongTrongJava.BaiGiang.TV;

public class Main {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("TV1 chanel is " + tv1.channel + " volume " + tv1.volumeLevel);
        System.out.println("TV2 chanel is " + tv2.channel + " volume " + tv2.volumeLevel);

    }
}
