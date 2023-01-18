package assignment7_4;

public class Tricyclefactory implements Cyclefactory{
    public Cycle cycleName(){
        System.out.println("Tricycle");

        return new Tricycle();
    }


}
