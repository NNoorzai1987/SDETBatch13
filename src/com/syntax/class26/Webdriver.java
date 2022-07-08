package com.syntax.class26;

public interface Webdriver {
    /*
   Create a WebDriver Interface that will have the following unimplemented behaviour:
   openBrowser(), closeBrowser(), maximizeWindow(), findElement().
   Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
*/
    void  openBrowser();
     void closeBrowser();
    void maximizeWindow();
    void findElement();

}

class chromeDriver implements Webdriver{
    @Override
    public void openBrowser() {
        System.out.println("by help of webdriver we can open the browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("by help of Webdriver we can close the browser");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("With help of Webdriver we can Maximize the window");

    }

    @Override
    public void findElement() {
        System.out.println("with help of webdriver we can find the element");

    }
}
class firefoxDriver implements Webdriver{
    @Override
    public void openBrowser() {
        System.out.println("by help of webdriver we can open the firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("by help of Webdriver we can close the firefox browser");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("With help of Webdriver we can Maximize the firefox window");

    }

    @Override
    public void findElement() {
        System.out.println("with help of webdriver we can find the element inside firefox browser");

    }

    public static void main(String[] args) {
        Webdriver[] webdriver={new chromeDriver(), new firefoxDriver()};

        for (Webdriver webdriver1:webdriver){
            webdriver1.openBrowser();
            webdriver1.closeBrowser();
            webdriver1.maximizeWindow();
            webdriver1.findElement();
        }

    }
}
