package me.xiaochutian.test;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Xiaochutian on 2016/6/17.
 */
public class MX {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCount = in.nextInt();
        long[] nums = new long[numCount];
        IntStream.range(0,numCount).forEach(i -> nums[i] = in.nextLong());
        in.close();

        long maxNum = 0;
        int maxNumLength = 0;
        long suf = 0;
        long pre = 0;
        for (long l : nums){
            maxNum = Math.max(maxNum,l);
            pre ^= l;
        }
        long max = pre;

        for (int i = 62; i >= 0; i--) {
            if ((maxNum & (((long)1) << i)) != 0){
                maxNumLength = i + 1;
                break;
            }
        }

        TrieTree tree = new TrieTree(maxNumLength);
        for (int i = nums.length - 1; i >= 0 ; i--) {
            suf ^= nums[i];
            pre ^= nums[i];
            tree.addPath(suf);
            max = Math.max(max,tree.getMaxXor(pre));
        }

        System.out.println(max);

    }
}
