package assignment7_5;

public class Secondclass {

   static class Inner2 extends Firstclass.Inner {

Inner2(String str){
    super(str);
    System.out.println(str);
}

        public static void main(String[] args) {

            Firstclass.Inner in1=new Firstclass.Inner("Prashant");

        }

    }
}
