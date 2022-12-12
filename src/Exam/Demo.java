package Exam;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        S<Integer >obj =new S<Integer>();
        obj.push(36);
        System.out.println(obj.pop());
    }
}
class S<E>
{
    Stack <E> ob =new Stack <E> ();
    public  void  push (E obj){
        ob.push(obj);

    }
    public  E pop()
    {
        E obj =ob.pop();
        return  obj;
    }
}
