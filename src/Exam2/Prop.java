package Exam2;

//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Prop {
    public static void main(String[] args) throws IOException {
        FileReader x=new FileReader("db.properties");
        Properties y =new Properties();
        y.load(x);
        //x.load(y);
        //y_load(x);


        System.out.println(y.getProperty("password"));
    }
}
