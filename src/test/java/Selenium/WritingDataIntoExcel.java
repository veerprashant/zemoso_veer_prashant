package Selenium;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class WritingDataIntoExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Employ Info");

        Object employ[][] = {
                {"EmpID", "Name", "Job",true},
                {100, "David", "QA",false},
                {101, "Smith", "Dev",true},
                {102, "john", "Manager",false},
                {103, "jimmy", "Analyst",false}
        };

        int rows = employ.length;
        int cols = employ[0].length;

        System.out.println(rows);
        System.out.println(cols);

        for (int i = 0; i < rows; i++) {
            XSSFRow row = sheet.createRow(i);

            for (int j = 0; j < cols; j++) {
                XSSFCell cell = row.createCell(j);
                Object value = employ[i][j];

                if (value instanceof String)
                    cell.setCellValue((String) value);

                if (value instanceof Integer)
                    cell.setCellValue((Integer) value);

                if (value instanceof Boolean)
                    cell.setCellValue((Boolean) value);
            }
        }
        FileOutputStream file = new FileOutputStream("src//test//java//Data//Employee3.xlsx");


        workbook.write(file);
        workbook.close();
System.out.println("Data is Added");
    }
}
