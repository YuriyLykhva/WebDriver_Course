package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WaiterWrapperClass;

public class ResultPage extends BasePage {

    public ResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='gs-title']/a/b[text()='Google Cloud Platform Pricing Calculator']")
    private WebElement gCPPricingCalculator;


    public CalculatorPage openCalcPage() throws InterruptedException {
        WaiterWrapperClass.waitForElement(driver, gCPPricingCalculator);
        Thread.sleep(15000);
        gCPPricingCalculator.click();
        return new CalculatorPage(driver);
    }
}
