package assignment7_2;

public class Cycle {
    public static void main(String[] args) {

        Cycle[] c=new Cycle[3];
        c[0]=new Bicycle();
        c[1]=new Unicycle();                        //upcasting
        c[2]=new Tricycle();

        c[0].wheel();
        c[1].wheel();
        c[2].wheel();



        //DownCasting

        Bicycle c1=(Bicycle)c[0];
        c1.balance();

        Unicycle c2=(Unicycle)c[1];
        c2.balance();

//        Tricycle c3=(Tricycle)c[2];
//        c3.balance();



        //Note: by using downcasting we can call only those method ehich are overriden or own method of subclass


    }


    public void wheel(){
        System.out.println("Wheels");
    }
}
