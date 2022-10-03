package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest {

    @Test
    public void checkFirstUnselectedCheckboxTest() {

        driver.get(Urls.HEROKUAPP_CHECKBOXES);

        boolean isFirstCheckboxSelected = driver.findElement(By.xpath("//input[1]")).isSelected();
        Assert.assertFalse(isFirstCheckboxSelected, "Checkbox is selected!");
    }

    @Test
    public void checkAndUncheckFirsCheckboxTest() {

        driver.get(Urls.HEROKUAPP_CHECKBOXES);

        WebElement firstCheckbox = driver.findElement(By.xpath("//input[1]"));
        firstCheckbox.click();
        boolean isFirstCheckBoxSelected = firstCheckbox.isSelected();
        Assert.assertTrue(isFirstCheckBoxSelected, "Checkbox is not selected");
    }

    @Test
    public void checkSecondUnselectedCheckboxTest() {

        driver.get(Urls.HEROKUAPP_CHECKBOXES);

        boolean isSecondCheckboxSelected = driver.findElement(By.xpath("//input[2]")).isSelected();
        Assert.assertTrue(isSecondCheckboxSelected, "Second checkbox is unchecked");
    }

    @Test
    public void uncheckAndCheckSecondCheckboxTest() {

        driver.get(Urls.HEROKUAPP_CHECKBOXES);

        WebElement secondCheckbox = driver.findElement(By.xpath("//input[2]"));
        secondCheckbox.click();
        boolean isSecondCheckBoxChecked = secondCheckbox.isSelected();
        Assert.assertFalse(isSecondCheckBoxChecked, "Second checkbox is checked");
    }

}
