package grade3.Tests;

import grade3.Pages.MainPage;
import grade3.Pages.ThirdGradePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;

/**
 *  play button is not shown in automation
 */
public class US001 extends TestBase{


    @Test
    public void userStory() throws InterruptedException {

        ThirdGradePage thirdGradePage = new MainPage().goToGrade("3rd");
        BrowserUtils.waitForVisibility(thirdGradePage.gamePenguin,10);
        thirdGradePage.gamePenguin.click();
        String actualTitle = thirdGradePage.getTitleOfThePage();
        Assert.assertTrue(actualTitle.contains("Penguin"));
        Thread.sleep(3);
      //  BrowserUtils.scrollToElement(thirdGradePage.playTheGameButton);
        thirdGradePage.goToTheFirstFrame();
        BrowserUtils.givePowerToActiveElement().sendKeys(Keys.RETURN);



    }
}
