package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest{

    @Test

    public void checkDifferentKeysForInput(){
        driver.get(Urls.HEROKUAPP_INPUTS);

        WebElement input = driver.findElement(By.xpath("//input"));

        input.click();
        input.sendKeys("3",Keys.ARROW_UP);

        String resultAfterIncrease = input.getAttribute("value");
        Assert.assertEquals(resultAfterIncrease , "4");

        input.sendKeys(Keys.BACK_SPACE, Keys.ARROW_DOWN);

        String resultAfterDecrease = input.getAttribute("value");
        Assert.assertEquals(resultAfterDecrease, "-1");
    }
}
