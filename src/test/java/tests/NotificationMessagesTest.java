package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessagesTest extends BaseTest {

    @Test
    public void checkNotificationTextTest() {
        driver.get(Urls.HEROKUAPP_NOTIFICATIONS);
        driver.findElement(By.linkText("Click here")).click();

        String noticeMessage = driver.findElement(By.id("flash")).getText();

        boolean isMessageSuccessful = noticeMessage.contains("Action successful");
        Assert.assertTrue(isMessageSuccessful, "Message is not correct!");

    }

}
