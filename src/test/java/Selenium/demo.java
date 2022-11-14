package Selenium;

import com.testing.framework.EmailUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class demo {
    public static void main(String[] args) throws IOException {


        FileInputStream input=new FileInputStream("//home//prav//Downloads//Employee.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(input);

        XSSFSheet sheet1=workbook.getSheetAt(0);

        sheet1.getRow(0).createCell(2).setCellValue("Pass");
        sheet1.getRow(1).createCell(2).setCellValue("Fail");

        FileOutputStream file=new FileOutputStream("//home//prav//Downloads//Employee.xlsx");
        workbook.write(file);
        workbook.close();










    }
}