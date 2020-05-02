package Input_OutPut;

import utility.XLSXFileReader;

public class ReadTestDataXLSXFile  {


    /**
     * @author Jahidul Islam
     * 1. Using utility.XLSXFileReader class read data/testData.xlsx file
     * 2. And print values in console
     * Hints all methods required are implemented in utility.XLSXFileReader class
     * all you need to do is use thsoe methods and store XLSX file in a
     * two dimensional array, later you can get the required value from the
     * that two dimensional array.
     * !!!! That's true I did not show you exactly this but you know all the
     * necessary components of it.
     *
     * */

    public static void main(String[] args) throws Exception {

        XLSXFileReader xlsxFileReader = new XLSXFileReader();
        xlsxFileReader.setExcelFile("/Users/kawsar/Desktop/Model Test/Module_Exam_2/data/testData.xlsx");

        String[][] testFile = xlsxFileReader.getExcelSheetData("Sheet1");

        System.out.println(testFile[0][1]);
    }



}
