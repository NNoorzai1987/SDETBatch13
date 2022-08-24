package com.syntax.class24;

public abstract class Parent01 {
     abstract void open();
     abstract boolean walking(boolean yes);
     abstract int age( int ag);
     public void close(){
          System.out.println("After all the job completed please close your shop ");
     }

}
class child01 extends Parent01{
     @Override
     void open() {
          System.out.println("My dad told me have to open the shop at 9");
     }

     @Override
     boolean walking(boolean yes) {
          System.out.println("Do you walk everyday to the shop?"+yes);
          return false;
     }

     @Override
     int age(int ag) {
          System.out.println("I am "+ag+" years old ");
          return 0;
     }

}
class groundchild extends Parent01{
     @Override
     void open() {
          System.out.println("My dad told me have to open the shop at 8:30");
     }

     @Override
     boolean walking(boolean yes) {
          System.out.println(" Does you dad told you to walk to the shop "+yes);
          return true;
     }

     @Override
     int age(int ag) {
          System.out.println("I heard your "+ag+" old");
          return 0;
     }
}
class testthem{
     public static void main(String[] args) {
          Parent01[] parent01s={new child01(),new groundchild()};
          for (Parent01 parent01:parent01s){
               parent01.open();
               parent01.walking(true);
               parent01.age(9);

               parent01.close();
          }
     }
}