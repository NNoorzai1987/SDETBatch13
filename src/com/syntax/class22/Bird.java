package com.syntax.class22;

public class Bird {
    void sing() {
        System.out.println("tak talak tak talak");
    }

    static class parad extends Bird {
        void sing() {
            System.out.println("mak malak mak malak ");

        }

       static class sparrow extends Bird {
            void sing() {
                System.out.println("leklaleko leklaleko leklaleko");
            }

        }

        public static void main(String[] args) {
      /*  Bird b=new Bird();
        b.sing();*/
            // parad n=new parad();
            sparrow s =new sparrow();
            s.sing();
        }
    }
}
