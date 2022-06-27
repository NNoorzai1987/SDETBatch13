package com.syntax.class24;
public abstract class File {
    /*
    * Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method while open is an abstract.
    * Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of* open behaviour:
    *  Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
    * */
    abstract void open();
    public void edit(){System.out.println("if want to make changes to your file please click on Edit menu bar");}
    public void close(){System.out.println("After you done with your task you can simply click on x button at the top right hand side to close your file"); }}
class JavaFile extends File{ @Override void open() {System.out.println("To open .java file we need notepad++ or sublime text,");}}
class WordFile extends File{ @Override void open() {System.out.println("TO open .doc file we need Microsoft word to be installed");}}
class PdfFile extends File{@Override void open() {System.out.println("To open PdfFile you need to installed the PDf application ");}

}