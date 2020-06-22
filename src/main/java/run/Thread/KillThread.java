package run.Thread;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class KillThread extends Thread {
    int i = 0;
    public void run() {
        while(true){
            try {
                Calendar c=Calendar.getInstance();//获得系统当前日期
                int year=c.get(Calendar.YEAR);
                int moth = c.get(Calendar.MONTH)+1;//系统日期从0开始算起
                int day=c.get(Calendar.DAY_OF_MONTH);
                int hour = c.get(Calendar.HOUR);//小时
                int minute =c.get(Calendar.MINUTE);//分
                int second = c.get(Calendar.SECOND);//秒

                System.out.println(year + "年" + moth + "月" +  day + "日"  + hour+ "时" + minute + "分" +  second + "秒");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

   /* public static void main(String[] args) {
        KillThread myThread = new KillThread();
        myThread.start();
      *//*  TimerTask ss =  new TimerTask() {
            public void run() {
                System.out.println("11232");
            }
        };
        Timer timer = new Timer();
        timer.schedule(ss,2000 ,1000);*//*

    }*/
}
