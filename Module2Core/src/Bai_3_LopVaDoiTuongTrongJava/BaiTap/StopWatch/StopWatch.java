package Bai_3_LopVaDoiTuongTrongJava.BaiTap.StopWatch;

import java.util.Date;

public class StopWatch {

    private long startTime;
    private long endTime;

    public long start() {
        long millis=System.currentTimeMillis();
        java.util.Date date=new java.util.Date(millis);

        return millis;

    }

    public long stop() {
        long millis=System.currentTimeMillis();
        java.util.Date date=new java.util.Date(millis);
        return millis;
    }

    public long getElapsedTime() {
        return (this.endTime - this.startTime);
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}
