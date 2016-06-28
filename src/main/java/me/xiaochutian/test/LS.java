package me.xiaochutian.test;

import java.util.Scanner;

/**
 * Created by Xiaochutian on 2016/6/14.
 */
public class LS {
    public static void main(String[] args) {
        System.out.println(-1%7);

//        Scanner in = new Scanner(System.in);
//        while (in.hasNextInt()){
//            int a = in.nextInt();
//            int b = in.nextInt();
//
//            double max = Math.floor(Math.max(a/(0.9*5),b/5));
//            double min = Math.ceil(a/(0.95*5));
//
//            System.out.println((int)max - (int)min + 1);
//        }
        int input = 4;
        int result = 0;
        int d,d2,r,r2,a;
        r2 = input << 1;
        int m = (int)Math.sqrt(r2);

        for(d = 1; d<=m; d++){
            if((r2 % d)==0){
                d2 = d << 1;
                for (a = 1; a<=Math.sqrt(r2/d2); a++){
//                    if
                }
            }
        }
    }




}
