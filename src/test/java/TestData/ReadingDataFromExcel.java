package TestData;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingDataFromExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("src//test//java//TestData//Employee.xlsx");
        Sheet sh= WorkbookFactory.create(file).getSheet("Sheet2");
//        String value= sh.getRow(0).getCell(0).getStringCellValue();
//        System.out.println(value);

       int LastRowIndex= sh.getLastRowNum();
        for (int i = 0; i <LastRowIndex ; i++) {
            int LastCellIndex=sh.getRow(0).getLastCellNum();
            for (int j = 0; j <LastCellIndex ; j++) {
                String value1= sh.getRow(i).getCell(j).getStringCellValue();
                System.out.println(value1+" ");
            }
            System.out.println();
        }
    }
}
