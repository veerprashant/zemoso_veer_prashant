package Selenium;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UpdateExcelNew {

    public void writeExcel(String sheetName, String cellValue, int row, int col) throws IOException {
        FileInputStream file=new FileInputStream("src/test/java/Data/Employee.xlsx");

        XSSFWorkbook wb=new XSSFWorkbook(file);

        XSSFSheet sheet=wb.getSheet(sheetName);

        sheet.getRow(row).createCell(col).setCellValue(cellValue);

        FileOutputStream output=new FileOutputStream("src/test/java/Data/Employee.xlsx");

                wb.write(output);

        wb.close();

        output.close();
    }
}
