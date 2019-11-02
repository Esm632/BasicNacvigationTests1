package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;

import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;




public class NavigationTests {

    public static void main(String[] args) {

        String url1 = "https://google.com";
        String url2 = "https://google.com";

        // open browser
        WebDriver driver = BrowserFactory.getDriver("chrome");

        // go to website https://google.com
        driver.get(url1);

        // save the title in a string variable
        String title_1 = driver.getTitle();

        // go to https://etsy.com
        driver.get(url2);

        //save the title in a string variable
        String title_2 = driver.getTitle();

        //Navigate back to previous page
        driver.navigate().back();
        /*
         if you don't wanna write StringUtility every step
         import StringUtility package and just continue with verify
        Verify that title is same in step  3  // option enter
        */
        // Verify that title is same in step 3
        StringUtility.verifyEquals(title_1,driver.getTitle());

        //Navigate forward to previous page
        driver.navigate().forward();

        /* Verify that title is same in step 5 */
        StringUtility.verifyEquals(title_2,driver.getTitle());


    }
}
