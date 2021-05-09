package grade3.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

public class ThirdGradePage extends MainPage{

    @FindBy(css = "img[alt='Penguin Jump Multiplication']")
    public WebElement gamePenguin;

    @FindBy(xpath = "//*[name()='g' and contains(@cursor,'pointer')]" +
            "//*[name()='text' and contains(@dy,'1em')]")
    public WebElement playTheGameButton;


    public void goToTheFirstFrame(){
        Driver.get().switchTo().frame("//*[name()='iframe' and @id='game']");
    }

    public void goToTheSecondFrame(){
        Driver.get().switchTo().frame("//*[name()='div' and @id='gameContainer']");
    }

    public void clickPlayButton(){
        playTheGameButton.click();
    }
}
