package TestData;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDataIntoExcel {
    public static void main(String[] args) throws IOException {

//        FileInputStream input=new FileInputStream("//home//prav//Downloads//Employee.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Sheet2");

        Object employ[][] = {
                {"EmpID", "Name", "Job"},
                {100, "David", "QA"},
                {101, "Smith", "Dev"},
                {102, "john", "Manager"},
                {103, "jimmy", "Analyst"}
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
        FileOutputStream file = new FileOutputStream("src//test//java//TestData//Employee.xlsx");


        workbook.write(file);
        workbook.close();

        System.out.println("Data Added successfully");
    }

}
