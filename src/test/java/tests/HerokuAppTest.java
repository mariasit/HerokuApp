package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HerokuAppTest extends BaseTest {

    @Test
    public void addRemoveElementsTest() {

        driver.get(Urls.HEROKUAPP_ADD_REMOVE_ELEMETS);

        driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();

        driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();

        String amountElementsAfterDelete = driver.findElement(By.id("elements")).getAttribute("childElementCount");
        Assert.assertEquals(amountElementsAfterDelete, "1");

    }

    @Test
    public void checkSortableDataTablesTest() {

        driver.get(Urls.HEROKUAPP_TABLES);

        String lastName = driver.findElement(By.cssSelector("#table1 > tbody > tr:nth-child(2) > td:nth-child(1)")).getText();
        String firstname = driver.findElement(By.cssSelector("#table1 > tbody > tr:nth-child(2) > td:nth-child(2)")).getText();
        String dues = driver.findElement(By.cssSelector("#table2 > tbody > tr:nth-child(2) > td.dues")).getText();
        String website = driver.findElement(By.cssSelector("#table2 > tbody > tr:nth-child(2) > td.web-site")).getText();

        Assert.assertEquals(lastName, "Bach");
        Assert.assertEquals(firstname, "Frank");
        Assert.assertEquals(dues, "$51.00");
        Assert.assertEquals(website, "http://www.frank.com");

    }


}
