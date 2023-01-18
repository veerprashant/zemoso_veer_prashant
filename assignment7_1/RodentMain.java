package assignment7_1;

public class RodentMain {

    public static void main(String[] args) {

        Rodent[] ar=new Rodent[3];
            ar[0]=new Mouse();
            ar[1]=new Gerbil();
            ar[2]=new Hamster();


            ar[0].eat();
            ar[0].run();

            ar[1].eat();
            ar[1].run();

            ar[2].eat();
            ar[2].run();

    }
}
