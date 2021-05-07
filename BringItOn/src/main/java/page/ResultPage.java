package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends BasePage {


    public ResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }
}
