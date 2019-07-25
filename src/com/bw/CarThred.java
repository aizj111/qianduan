package com.bw;

public class CarThred extends Thread {
    static int stop = 0;

    //汽车线程
    @Override
    public void run() {
        while (true) {
            stop++;
            try {
                sleep(1000);
                if (stop % 5 == 0) {
                    System.out.println("红灯了，所有车辆禁止通行,请等待绿灯在继续前进");
                    sleep(3000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("所有汽车在行驶！！");
        }
    }

    public static void main(String[] args) {
        CarThred carThred = new CarThred();
        carThred.run();
    }
}
