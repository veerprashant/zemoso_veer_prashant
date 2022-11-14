package Selenium;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WritingDataIntoCsv2 {
    public static void main(String[] args) throws IOException {

        CSVWriter writer = new CSVWriter(new FileWriter("src//test//java//Data//CSVdataList.CSV"));

        String[] set1 = {"Name", "Country", "Id", "Dept"};
        String[] set2 = {"Ramesh", "USA", "100", "IT"};
        String[] set3 = {"Prashant", "India", "101", "Software"};
        String[] set4 = {"Manish", "USA", "102", "IT"};


        ArrayList ar = new ArrayList();

        ar.add(set1);
        ar.add(set2);
        ar.add(set3);
        ar.add(set4);

        writer.writeAll(ar);
        writer.flush();

        System.out.println("Data added");
    }
}