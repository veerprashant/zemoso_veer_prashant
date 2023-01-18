package assignment7_4;

public class Main {
    public static void main(String[] args) {

        rideCycle(new Bicyclefactory());
        rideCycle(new Unicyclefactory());
        rideCycle(new Tricyclefactory());


    }

        public static void rideCycle(Cyclefactory factory){
            Cycle c = factory.cycleName();
              c.ride();

        }

}
