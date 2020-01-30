package com.humblebundle;

import org.junit.Assert;
import org.junit.Test;
 
public class humblebundleTest  extends WebDriverSettings{

    @Test
    public void firstTest() {

        driver.get("https://www.humblebundle.com/");
        String title = driver.getTitle();
        Assert.assertEquals("Humble Bundle | game bundles, book bundles, software bundles, and more", title);
        }

    @Test
    public void firstTest1() {
        driver.get("https://www.humblebundle.com/");
        String title = driver.getTitle();
        Assert.assertEquals("Humble Bundle | game bundles, book bundles, software bundles, and more", title);
         }

}
