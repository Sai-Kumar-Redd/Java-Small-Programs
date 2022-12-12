package LambdaExpression;

import java.util.function.BiConsumer; //Lambda Expression  with Two parameters

public class LambdaTest {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer=(a,b)->System.out.println(a+b);
        biConsumer.accept(10,5);
    }
}
