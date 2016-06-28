package me.xiaochutian.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Xiaochutian on 2016/5/27.
 */
public class MaximunXor {
    public static void main(String[] args) {
        //Input
        Scanner in = new Scanner(System.in);
        int numCount = in.nextInt();
        long[] nums = new long[numCount];
        IntStream.range(0,numCount).forEach(i->nums[i] = in.nextLong());
        in.close();

        long maxNum = 0;                    //maxNum for calculating tree height
        int maxNumLength = 0;
        long curXorSuf = 0;                 //suffix ,add to trieTree (from 0 to allSum)
        long curXorPre = 0;                 //prefix (from allSum to 0)
        for (long l :nums) {
            maxNum = Math.max(maxNum,l);
            curXorPre ^= l;
        }
        long max = curXorPre;               //maxXor

        for (int i = 62; i >=0 ; i--) {     //calculate the maxNumLength using maxNum
            if((maxNum & (((long)1) << i)) != 0){
                maxNumLength = i + 1 ;
                break;
            }
        }

        TrieTree tree = new TrieTree(maxNumLength);     //trieTree to store the suffixs

        for (int i = nums.length-1; i >=0 ; i--) {
            curXorSuf ^= nums[i];
            curXorPre ^= nums[i];
            tree.addPath(curXorSuf);
            max = Math.max(max,tree.getMaxXor(curXorPre));
        }
        System.out.println(max);
    }
}

class TrieNode{
    //0 to left, 1 to right
    TrieNode left;
    TrieNode right;
    long value;
    TrieNode(){}
    TrieNode(long value){
        this.value = value;
    }
}

class TrieTree{
    //maxNumLength + 1 TrieNodes in a path (root trieNode is 0)
    HashSet<Long> xorSet = new HashSet<>();         //store the xors already in tree
    TrieNode head;
    long bit = 1;
    int maxNumLength;
    TrieTree(int maxNumLength){
        // 2^40 > 1e12  (replace 40 with maxNumLength)
        head = new TrieNode();
        TrieNode index = head;
        this.maxNumLength = maxNumLength;
        for (int i = 0; i < maxNumLength; i++) {
            index.left = new TrieNode();
            index = index.left;
        }
    }
    public long getMaxXor(long xorValue){
        long notXorValue = xorValue ^ ((bit << maxNumLength )-1);
        TrieNode index = head;
        for (int i = maxNumLength - 1; i >=0 ; i--) {
            if ((notXorValue & (bit << i)) == 0){
                index = index.left != null ? index.left : index.right;
            }else{
                index = index.right != null ? index.right : index.left;
            }
        }
        return index.value ^ xorValue;
    }

    public void addPath(long xorValue){
        if (xorSet.contains(xorValue)){
            return;
        }
        TrieNode index = head;
        for (int i = maxNumLength -1; i >0 ; i--) {
            if((xorValue & (bit<< i)) == 0){
                if(index.left == null){
                    index.left = new TrieNode();
                }
                index = index.left;
            }else{
                if(index.right == null){
                    index.right = new TrieNode();
                }
                index = index.right;
            }
        }
        if((xorValue & bit) == 0){
            if(index.left == null){
                index.left = new TrieNode(xorValue);
            }
        }else{
            if(index.right == null){
                index.right = new TrieNode(xorValue);
            }
        }
        xorSet.add(xorValue);
    }
}
