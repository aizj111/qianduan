package com.bw;

public class NumberThred extends Thread {
    String s1 = "123";
    String s2 = "456";
    String s3 = "789";
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            StringBuffer sb = new StringBuffer();
            String[] t1 = s1.split("");
            String[] t2 = s2.split("");
            String[] t3 = s3.split("");
            sb.append(t1[i]+""+t2[i]+""+t3[i]);
            System.out.println(sb.toString());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        NumberThred numberThred = new NumberThred();
        numberThred.run();
    }
}
