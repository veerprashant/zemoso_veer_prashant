package assignment6;

public class ConstructorInitialize {

    public ConstructorInitialize(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {

        ConstructorInitialize[] ar=new ConstructorInitialize[10];
        for (int i = 0; i < ar.length ; i++) {

            ar[i] = new ConstructorInitialize("Prashant");
        }
    }
}
