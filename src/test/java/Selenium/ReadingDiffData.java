package Selenium;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingDiffData {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("src/test/java/Data/Employee3.xlsx");
        Sheet sh = WorkbookFactory.create(file).getSheet("Employ Info");


        int LastRowIndex = sh.getLastRowNum();
        for (int i = 0; i < LastRowIndex; i++) {
            int LastCellIndex = sh.getRow(0).getLastCellNum();
            for (int j = 0; j < LastCellIndex; j++) {
                Cell cellinfo = sh.getRow(i).getCell(j);
                CellType s1 = cellinfo.getCellType();

                if (s1==CellType.STRING){
                    System.out.println(cellinfo+" ");
                }
                else if (s1==CellType.NUMERIC){
                    System.out.println(cellinfo+" ");
                } else if (s1==CellType.BOOLEAN) {
                    System.out.print(cellinfo+" ");
                }

            }
            System.out.println();
        }

    }
}
