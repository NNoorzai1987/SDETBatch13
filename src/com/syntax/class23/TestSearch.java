package com.syntax.class23;

public class TestSearch {
    public static void main(String[] args) {
       /* Search search=new wwf();
        search.open();
        search.chose(3);
        search.implement("https://www.computerhope.com");
        search.close();
        */

        Search []searches={new Search(),new stockflow(),new wwf()};

        for(Search search:searches){
            search.open();
            search.chose(2);
            search.implement("https://stackoverflow.com");
            search.close();
        }

    }



}
