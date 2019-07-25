package com.bw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountText {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("d:123.txt"));
        StringBuffer sb = new StringBuffer();
        String s;
        try {
            while ((s = bufferedReader.readLine())!= null)
                sb.append(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        String[] split = sb.toString().split("");
        for (int i = 0; i < split.length; i++) {
            if(split[i].equals("a")){
                count1++;
            }else if (split[i].equals("l")){
                count2++;
            }else if (split[i].equals("i")){
                count3++;
            }else{
                count4++;
            }
        }
        System.out.println("a的次数:"+count1+",l的次数"+count2+",i的次数"+count3+",b的次数"+count4);
    }
}
