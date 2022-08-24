package com.syntax.Reviewclass13;

import com.syntax.utils.ConfigReader;

import java.util.Properties;

public class ConfigFiles1 {
    public static void main(String[] args) {

        Properties properties= ConfigReader.read("Files/Config.properties");
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("URL"));


    }
}
