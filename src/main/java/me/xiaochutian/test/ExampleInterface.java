package me.xiaochutian.test;

import java.util.ArrayList;

/**
 * Created by Xiaochutian on 2016/6/10.
 */
public interface ExampleInterface {
    String constantVariable = "Hello Interface";
    void doSomething();
    default void move(){
        System.out.println("Move Forward");
    }
    static void print(){
        System.out.println("Hello Static Method");
    }
    class InnerClass{}
}
