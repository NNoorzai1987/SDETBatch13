package com.syntax.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderReview {
    public static Properties read(String path)  {

        // Properties class that handles the .properties files
        Properties properties=new Properties();
        FileInputStream fileInputStream=null;
        try{
            //Navigate to that location
            fileInputStream=new FileInputStream(path);

            //Loads the data from the HardDrive to RAM
            properties.load(fileInputStream);
        }catch (IOException io){
            System.out.println("Please check the file at this path if it is present path = "+path);
            io.printStackTrace();
        }finally {
            closeFile(fileInputStream);

        }
        return properties;
    }

    public static void closeFile(FileInputStream fileInputStream){

        try {
            if(fileInputStream!=null){
                fileInputStream.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
