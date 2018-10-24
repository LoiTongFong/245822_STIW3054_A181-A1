
package com.mycompany.rta1;

import static com.mycompany.rta1.wikiData.data;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {
    public static void writeExcel() throws IOException {
        try{
        String sheetName = "Trivia";
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Trivia");  
        
        for (int i=0;i<data.size();i++){
                XSSFRow row=sheet.createRow(i);
                XSSFCell cell=row.createCell(0);
                cell.setCellValue(data.get(i).getTh());
                XSSFCell cell2=row.createCell(1);
                cell2.setCellValue(data.get(i).getTd());
            }
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Tong Fong\\Desktop\\Trivia.xlsx");
            workbook.write(fileOutputStream);
            workbook.close();
            System.out.println("Excel File Write Sucessfully");
        }catch (Exception e){
           System.out.println(e.getMessage());
        }
       
    }
}
