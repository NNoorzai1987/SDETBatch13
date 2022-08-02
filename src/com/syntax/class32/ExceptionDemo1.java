package com.syntax.class32;

import com.syntax.utils.Constants;
import com.syntax.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        List<Map<String,String>> excelData= null;
        try {
            excelData = ExcelReader.read(Constants.ExcelFilePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /*Map<String ,String> firstRow=excelData.get(1);
        System.out.println(firstRow.get("LastName"));
        System.out.println(firstRow.get("Age"));*/
            for (Map<String,String> row:excelData
            ) {
                for (Map.Entry<String,String> entry: row.entrySet()
                ) {
                    System.out.println(entry.getKey()+" "+entry.getValue());
                }
                System.out.println("***************");
            }



        System.out.println("import line of code");
    }
}
