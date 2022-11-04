
    import java.io.*;
import java.util.Scanner;

    public class Assignment4 {
        //File Handling

        public static void main(String[] args) throws IOException {

            System.out.println("Create File Operation");
            createFile();
            System.out.println();
            System.out.println();

            System.out.println("Write File Operation");
            writeData();
            System.out.println();
            System.out.println();
            System.out.println("Read File Operation");
            readData();
            System.out.println();
            System.out.println();
            System.out.println("Get Information About file");
            getFileInformation();
        }

        public static void createFile() {


            try {
                File file = new File("//home//prav//MyFile.txt");

                if (file.createNewFile()) {
                    System.out.println("MyFile Created Successfully");
                } else {
                    System.out.println("File Already Exist");
                }
            } catch (IOException e) {
                System.out.println("Error In code");
            }
        }


        public static void writeData() {

            try {
                String input = "Hello World";

                FileWriter ip = new FileWriter("//home//prav//MyFile.txt");
                ip.write(input);
                System.out.println("Data IS written Successfully");
                ip.close();
            } catch (IOException e) {
                System.out.println("Error In code");
            }
        }


        public static void readData() throws IOException {

            FileReader rd=new FileReader("//home//prav//MyFile.txt");
            Scanner myReader = new Scanner(rd);
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        }

        public static void getFileInformation()
        {
            File file=new File("//home//prav//MyFile.txt");

            if(file.exists())
            {
                System.out.println("File Name: "+file.getName());
                System.out.println("File Path: "+ file.getAbsoluteFile());
                System.out.println("File Writeable: "+file.canWrite());
                System.out.println("File Readable "+file.canRead());
                System.out.println("File Size: "+file.length());
            }
            else {
                System.out.println("File Doesn't Exists");
            }
        }


    }




