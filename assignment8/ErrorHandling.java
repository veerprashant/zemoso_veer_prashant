package assignment8;

import java.lang.reflect.Array;

public class ErrorHandling {

    int a=10;
    int b=0;

    int ans;

    String str=null;

    public void div() throws NullPointerException,ArithmeticException,ArrayIndexOutOfBoundsException {

        try {


            //Arithmetic exception

//            ans = a / b;
//            System.out.println(ans);



//            Array index out of bounds exception

            int[] ar = new int[3];
            ar[5]=10/0;                                    //Arithmetic exception  && Array index out of bounds exception
            System.out.println(ar[6]);


            //Null pointer exception
            System.out.println(str.toString());
        }

        catch (Exception e){

            e.printStackTrace();

            System.out.println(e);

        }
        finally {
            System.out.println("Finally block executed");
        }

    }



    public static void main(String[] args)  {
        ErrorHandling er=new ErrorHandling();
        er.div();
    }
}
