package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class ResultPage extends BasePage {

    @FindBys({@FindBy(xpath = "//ol[@class='bash']/li")})
    private List<WebElement> pasteNameFields;

    public ResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getTextFromField() {
        return pasteNameFields.get(0).getText();
    }



}
