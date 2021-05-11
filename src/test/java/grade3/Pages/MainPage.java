package grade3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "img[alt='4th grade math games']")
    public WebElement thirdGrade;

    /**
     *
     * @param grade
     * grade must be ----> 1st || 2nd || 3rd || 4th || 5th || 6th
     * @return
     */
    public ThirdGradePage goToGrade(String grade){
        String css = "img[alt='"+grade+ " grade math games']";
        Driver.get().findElement(By.cssSelector(css)).click();
        return new ThirdGradePage();
    }

    public String getTitleOfThePage(){
        return Driver.get().getTitle();
    }


}
