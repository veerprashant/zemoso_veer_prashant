package assignment7_3;

public class Main {

    public static void n1(InterfaceFirst first){
        first.m1();
    }

    public static void n2(InterfaceSecond second){
        second.m3();
    }

    public static void n3(InterfaceThird third){
        third.m5();
    }

    public static void n4(InterfaceFourth fourth){
        fourth.m7();
    }

    public static void main(String[] args) {

        ConcreteClass c=new ConcreteClass();
        n1(c);
        n2(c);
        n3(c);
        n4(c);





    }
}
