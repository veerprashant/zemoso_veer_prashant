import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Assignment3 {

    public static void main(String[] args) throws ParseException {
        System.out.println("Enter the number of inputs");
        Scanner scan = new Scanner(System.in);

        int noOfInputs = scan.nextInt();
        System.out.println("Enter the " + noOfInputs + " Sets of date to check for:");
        System.out.println("Enter the date in dd-mm-yyyy format");
        String data[][] = new String[noOfInputs][2];
        String signupDate = null;
        String currentDate = null;

        for (int i = 0; i < noOfInputs; i++) {
            signupDate = scan.next();
            currentDate = scan.next();
            data[i][0] = signupDate;
            data[i][1] = currentDate;
        }
        System.out.println("OutPuts");
        for (int i = 0; i<noOfInputs; i++) {
try
{
            if (checkValidity(data[i][0]) && checkValidity(data[i][1])) {

                getDataRange(data[i][0], data[i][1]);

            }
} catch (Exception e)
{
    System.out.println("Invlid Date");
}
        }
        scan.close();
    }
    private static  boolean checkValidity(String date)
    {
        boolean isvalid=false;
        if(date.length()==10)
        {
            isvalid=true;
        }
        return isvalid;
    }

     static int getDataRange(String signup, String current) throws ParseException {
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        format.setLenient(false);
        Date signupDate=null, currentDate=null;
        try{
            signupDate=format.parse(signup);
            currentDate=format.parse(current);
        }
        catch (ParseException e)

        {
            System.out.println("Date is Invalid");
            return 0;
        }
        if (signupDate.after(currentDate))
        {
            System.out.println("No Range");
        }
        else {
            Calendar calsignup=Calendar.getInstance();
            calsignup.setTime(signupDate);

            Calendar calCurrent=Calendar.getInstance();
            calCurrent.setTime(currentDate);


            int years= calCurrent.get(Calendar.YEAR)-calsignup.get(Calendar.YEAR);
            calsignup.add(Calendar.YEAR,years);
            calsignup.add(Calendar.DAY_OF_MONTH, -30);
            System.out.println(format.format(calsignup.getTime())+"  ");
            calsignup.add(Calendar.DAY_OF_MONTH,60);
            if(calsignup.before(calCurrent))
            {
                System.out.println(format.format(calsignup.getTime()));
            }
            else {
                System.out.println(format.format(calCurrent.getTime()));
            }

        }

return 0;
    }


}
