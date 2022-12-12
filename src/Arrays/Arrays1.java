package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrays1 {
    public static void main(String[] args) {
        ArrayList<String >array=new ArrayList<String>();
        array.add("Sai");
        array.add("Kumar");
        array.add("Reddy");
        array.add("pavani");
        array.add("Nihrika");
        array.forEach(sai->System.out.println(sai));

        System.out.println(array);
        Iterator<String>itr=array.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        if(array.contains("Sai")) {
            System.out.println("Found");
        }

            else {
            System.out.println("Not Found");
        }

        }

    }

