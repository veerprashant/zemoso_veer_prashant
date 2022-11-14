package Selenium;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUpdate {

    public void updateExcelfile() throws IOException {
System.out.println("Update");

//try{
    FileInputStream file=new FileInputStream("//home//prav//Downloads//Employee.xlsx");
    Workbook workbook = WorkbookFactory.create(file);
    Sheet sh=workbook.getSheet("Employe Info");

    int lastRowCount=sh.getLastRowNum();

    System.out.println("Rows before Updating :- "+lastRowCount);

    List userList = getUserList();

    for (int i = 0; i <userList.size() ; i++) {

        Row dataRow = sh.createRow(lastRowCount++);

        dataRow.createCell(0).setCellValue(userList.get(i).toString());
        dataRow.createCell(1).setCellValue(userList.get(i).toString());
        dataRow.createCell(2).setCellValue(userList.get(i).toString());
        dataRow.createCell(3).setCellValue(userList.get(i).toString());


    }
    file.close();

    FileOutputStream output=new FileOutputStream("src//test//java//Data//Employee.xlsx");
    workbook.write(output);
    output.close();

    System.out.println("Update complete");
//}
//catch (Exception e){
//
//}
    }

    public List getUserList(){

        String[] set1 = {"Name", "Country", "Id" };
        String[] set2 = {"Ramesh", "USA", "100"};
        String[] set3 = {"Prashant", "India", "101"};
        String[] set4 = {"Manish", "USA", "102"};


        List ar=new ArrayList<>();
        ar.add(set1);
        ar.add(set2);
        ar.add(set3);
        ar.add(set4);

        return ar;
    }
}
