package Selenium;

import java.io.IOException;

public class ExcelMain {

    public static void main(String[] args) throws IOException {

        ExcelUpdate update=new ExcelUpdate();
        update.updateExcelfile();

        System.out.println("Main method executed");
    }
}
