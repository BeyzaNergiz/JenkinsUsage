package utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class IkinciWHD {

    public static String ikinciSayfaWhd(String ilkSafyaWindowHandleDegeri, WebDriver driver){

        String ikinciSayfaWhd ="";
        Set<String> windowHandlesSeti = driver.getWindowHandles();

        for (String each:windowHandlesSeti
             ) {
            if (!each.equals(ilkSafyaWindowHandleDegeri)){
                ikinciSayfaWhd = each;
            }
        }




        return ikinciSayfaWhd;
    }
}
