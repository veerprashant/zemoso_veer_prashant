package Selenium;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExcelMainNew {

    UpdateExcelNew update=new UpdateExcelNew();

    @Test
    public void writeExcelTest() throws IOException {
        update.writeExcel("Employ Info","Department",0,4);
    }
    @Test
    public void writeExcelTest1() throws IOException {
        update.writeExcel("Employ Info","Software",1,4);
    }

}
