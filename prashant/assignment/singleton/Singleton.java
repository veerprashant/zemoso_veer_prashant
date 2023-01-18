package prashant.assignment.singleton;

import java.io.PrintStream;

public class Singleton {
    String name;

    public Singleton(String name){
        this.name=name;

    }

    public static String methodFirst(String name){
        System.out.println(name);
        return name;
    }

    //error: static method can only access static data members

    public  String methodSecond(String input){
        System.out.println(input);
        return input;

    }







}
