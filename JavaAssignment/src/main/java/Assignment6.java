import java.io.File;
import java.util.Scanner;

public class Assignment6 {


        public static void main(String[] args)
        {
            directory();

        }

        public static void directory()
        {
            File directory=new File("//home//prav");
            String input;

            Scanner scan=new Scanner(System.in);
            do{
                int i;
                System.out.println("Enter the Name of file");
                input=scan.nextLine();
                String[]   files=directory.list();

                for(String s:files) {
                    if (input.equals(s)) {
                        System.out.println("Files Found : ");
                        System.out.println(s);
                        System.out.println("File Path : " + directory.getAbsolutePath());
                    }


                }

            }
            while(true);
        }
    }



