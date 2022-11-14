package Selenium;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingDataIntoCSV {
    public static void main(String[] args) throws IOException {

        CSVWriter writer=new CSVWriter(new FileWriter("src//test//java//Data//CSVdata.CSV"));

        String [] set1={"Name","Country","Id","Dept"};
        String [] set2={"john","USA","100","IT"};
        String [] set3={"smith","India","101","Software"};
        String [] set4={"deny","USA","102","IT"};



        writer.writeNext(set1);
        writer.writeNext(set2);
        writer.writeNext(set3);
        writer.writeNext(set4);

        writer.flush();

        System.out.println("Data added");

    }
}
