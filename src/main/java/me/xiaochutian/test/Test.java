package me.xiaochutian.test;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Xiaochutian on 2016/5/10.
 */
public class Test {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        System.out.println();
        al.add("aa");
        System.out.println();
//        ArrayList<ArrayList<String>>  ll = new ArrayList<>();
//        LinkedTransferQueue
        StringBuilder sb1 = new StringBuilder();
        StringBuffer sb2 = new StringBuffer();
        String s = "hahaha";
        s.indexOf("hehe");
//        System.out.println(s.substring(1,4));

//        Arrays.sort();
        List<Object> list1 = new ArrayList<>();
        Collections.sort(list1,(x,y)->x.hashCode() - y.hashCode());

        List list = Arrays.asList("aaa","bbb","ccc","ddd");
        list.stream().forEach(System.out::println);

        int a = 1, b = 2;

        List<Integer> l = new ArrayList<>();

        List<Integer> primes  = Arrays.asList(2,3,5,7,11,13,17,19,23,29);
        IntSummaryStatistics statistics = primes.stream().mapToInt(x->x).summaryStatistics();
//        List<Integer> chars = Arrays.asList("abcdefg".toCharArray());
        int[] counts = new int[128];
        Map<Integer, Long> collect1 = s.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        String t = "hahaha";
        Map<Integer, Long> collect = t.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1+" "+collect+" "+collect.equals(collect1));
//        System.arraycopy();

    }
}
