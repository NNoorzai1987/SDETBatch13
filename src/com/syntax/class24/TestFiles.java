package com.syntax.class24;

public class TestFiles {
    public static void main(String[] args) {
  File [] files={new JavaFile(),new WordFile(),new PdfFile()};
        for(File file:files){
            file.open();
            file.edit();
            file.close();
        }
    }
}
