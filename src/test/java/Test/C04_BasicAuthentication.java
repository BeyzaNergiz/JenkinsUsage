package Test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C04_BasicAuthentication extends TestBase {
    @Test
    public void test01(){


        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    //4- Basarili sekilde sayfaya girildigini dogrulayin
        String expectedIcerik = "Congratulations";
        WebElement tebrikYaziElementi = driver.findElement(By.tagName("p"));
        String actualTebrikYazisi= tebrikYaziElementi.getText();

        Assert.assertTrue(actualTebrikYazisi.contains(expectedIcerik));

        bekle(2);
        driver.quit();
    }
}