package FunctionalInterface;


import Arrays.Test;
import StaticMethod.TestStaticMehod;

import java.util.function.BiConsumer;

interface test{
      void Calculate(int a,int b);  //Interface With Two Parameters

        }

public class Sample1 {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer>biConsumer=(a,b)->System.out.println(a+b);
        biConsumer.accept(10,6);


        }

    }


