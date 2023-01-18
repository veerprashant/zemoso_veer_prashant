package prashant.assignment.main;

import prashant.assignment.data.Data;
import prashant.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        //FirstClass
Data data=new Data();
data.methodFirst();
data.methodSecond(10,'c');


//SecondClass

        String object = Singleton.methodFirst("Prashant");


        Singleton s=new Singleton("Prashant");

//         String obj=s.methodFirst();
           s.methodSecond(object);



    }




}
