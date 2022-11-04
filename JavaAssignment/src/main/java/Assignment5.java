import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Assignment5
{



        public static void main(String[] args)
        {
            directory();

        }

        public static void directory()
        {
            String input=" ";
            int number;

            File directory=new File("//home//prav");
            Scanner scan=new Scanner(System.in);
            do{
                int i=0;

                System.out.println("Enter Number of files to find");
                number=scan.nextInt();
                System.out.println("Enter the Name of file");
             for (int j=0; j<=number; j++) {

                input = scan.nextLine();

            }

              ArrayList tr=new ArrayList(input);

               String[]   files=directory.list();
               for(String filename:files){

                    if (input.equals(filename)) {
                        System.out.println("Files Found : ");
                        System.out.println(filename);
                        System.out.println("File Path : " + directory.getAbsolutePath());

                }
                }
            }
            while(true);
        }
    }


