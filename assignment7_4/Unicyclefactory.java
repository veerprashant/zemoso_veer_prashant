package assignment7_4;

public class Unicyclefactory implements Cyclefactory{
    public Cycle cycleName(){
        System.out.println("Unicycle");
        return new Unicycle();
    }
}
