package com.swiggy.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtils {

    private static final String FILE_PATH = "C:/Users/dulee/eclipse-workspace/SwiggyAutomationDuleeka/src/resources/TestData.xlsx";

    // Method to read data from Excel
    public static String readDataFromExcel(String sheetName, int rowNum, int colNum) {
        try (FileInputStream fis = new FileInputStream(new File(FILE_PATH));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowNum);
            Cell cell = row.getCell(colNum);

            return cell.toString();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to write data to Excel
    public static void writeDataToExcel(String sheetName, int rowNum, int colNum, String data) {
        try (FileInputStream fis = new FileInputStream(new File(FILE_PATH));
             Workbook workbook = new XSSFWorkbook(fis);
             FileOutputStream fos = new FileOutputStream(new File(FILE_PATH))) {

            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowNum);
            Cell cell = row.createCell(colNum);
            cell.setCellValue(data);

            workbook.write(fos);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
