package assignment7_4;

public class Bicyclefactory implements Cyclefactory{

    public Cycle cycleName(){
        System.out.println("Bicycle");
        return new Bicycle();
    }
}
