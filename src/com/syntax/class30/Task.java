package com.syntax.class30;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task {
    /*Create a property file to store following configurations: browser=chrome
     url=https://facebook.com username password*/
    public static void main(String[] args) throws IOException {
        String path ="Files/Facebook.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("browser","chrome");
        properties.setProperty("url","https://facebook.com");
        properties.setProperty("Username","Naveed_0102");
        properties.setProperty("Password","USA@Best");
        properties.store(fileOutputStream,"Creating account @ www.facebook.com");

        fileOutputStream.close();
    }
}
