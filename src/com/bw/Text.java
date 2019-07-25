package com.bw;

import java.util.Random;

public class Text {
    static int[] arr= {1,5,10,20};

    public static void main(String[] args) {
        Random ra =new Random();
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        long l = System.nanoTime();

       System.out.println(l % sum);
    }
}
