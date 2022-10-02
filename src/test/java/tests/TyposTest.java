package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TyposTest extends BaseTest{

    @Test

    public void checkTyposInTextTest() {

        String textWithoutTypos = "Sometimes you'll see a typo, other times you won't.";

        driver.get(Urls.HEROKUAPP_TYPOS);

        String actualResultOfText = driver.findElement(By.xpath("//div[@class='example']//p[2]")).getText();
        Assert.assertEquals(actualResultOfText, textWithoutTypos);

    }

}
