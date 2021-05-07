package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage extends BasePage {

    //TODO: do we need CALCPAGE_URL?
    public static final String CALCPAGE_URL = "https://cloud.google.com/products/calculator";

    public CalculatorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//md-tab-item[@tabindex='-1']//div[@class='name ng-binding'][text()='Compute Engine']")
    private WebElement computeEngineButton;

    public ComputeEnginePage openComputeEnginePage() {
        computeEngineButton.click();
        return new ComputeEnginePage(driver);
    }
}
