package ss4_class_object.bai_tap;

import java.util.Date;

public class StopWatch {
    Date startTime,endTime;
    public StopWatch(){
        this.startTime = new Date();
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
    public void start(){
this.startTime = new Date();
    }
    public void stop(){
        this.endTime = new Date();
    }
    public long getElapsedTime(){
        return endTime.getTime() - startTime.getTime();
    }

    public static void main(String[] args) {
     StopWatch stopWatch = new StopWatch();
     stopWatch.start();
        int a =0;
        for (int i = 0; i < 10000000; i++) {
           a +=  i;
        }
        stopWatch.stop();
        System.out.println("time " + stopWatch.getElapsedTime());
    }

}
