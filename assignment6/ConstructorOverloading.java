package assignment6;

public class ConstructorOverloading {

    int sum;

    public ConstructorOverloading(){
this(10,20);
    }

    public ConstructorOverloading(int a , int b){
        this.sum=a+b;
    }

    public void addition(){
        System.out.println(sum);
    }

    public static void main(String[] args) {

        ConstructorOverloading co=new ConstructorOverloading();
        co.addition();
    }
}
