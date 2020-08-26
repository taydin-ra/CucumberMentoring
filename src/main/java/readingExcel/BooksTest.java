package readingExcel;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BooksTest {
    public static void main(String[] args) throws IOException, InvalidFormatException {

        /*
        DDT-Data Driven Testing -Datalari disardan(excel dokumani) alip test etmek
        // Workbook wb = new XSSFWorkbook( file );//xlsx
       // Workbook wb = new HSSFWorkbook( file ); //xls
         */

        File file = new File("src/main/resources/Representatives.xlsx"); //path
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheet("data");
        int rowNum = sheet.getPhysicalNumberOfRows(); // kac tane row un kullanildigini veriyor

        System.out.println(rowNum);
        int firstRow = sheet.getFirstRowNum(); // ilk indexteki(sifirdaki) kacinci row oldugunu
        int lastRow = sheet.getLastRowNum();// sonuncu row sayisini
        int rowCount = lastRow - firstRow;

        System.out.println(rowCount);

//        Row row = sheet.getRow(1);
//        Cell cell = row.getCell(2);

// String disindaki formatlar icin kullaniliyor

//        DataFormatter formatter = new DataFormatter();
//
//        Object value = formatter.formatCellValue(cell);
//
//        System.out.println(value);

        Map<String, String> NameTable = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            Row row = sheet.getRow(i);
            Cell cell0 = row.getCell(0);
            Cell cell1 = row.getCell(2);
            NameTable.put(cell0.getStringCellValue(), cell1.getStringCellValue());

        }
        System.out.print(NameTable);

    }
}
