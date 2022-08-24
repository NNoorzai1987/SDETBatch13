package com.syntax.class31;

import com.syntax.utils.ConfigReaderReview;
import com.syntax.utils.Constants;

import java.io.IOException;
import java.util.Properties;

public class ConfigReaderDemo {
    public static void main(String[] args) throws IOException {
      Properties properties= ConfigReaderReview.read(Constants.ConfigReaderPath);
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
    }
}
