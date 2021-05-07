package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WaiterWrapperClass;

import static page.CalculatorPage.CALCPAGE_URL;

public class ComputeEnginePage extends BasePage {

//    private static final String COMPUTEENGINEPAGE_URL = "https://cloud.google.com/";

    public ComputeEnginePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //TODO: this is for testing compute engine separately
    public ComputeEnginePage openComputeEnginePage() {
        driver.get(CALCPAGE_URL);
//        Thread.sleep(10000);
//        WaiterWrapperClass.waitForElement(driver, label);
        return this;
    }

    @FindBy(xpath = "//h2[text()='Google Cloud Pricing Calculator']")
    private WebElement label;

    //TODO: Cannot locate due to iframe
    @FindBy(xpath = "//input[@id='input_66']")
    private WebElement numberOfInstanceField;

    @FindBy(xpath = "//*[@id='select_value_label_599']/span[1]")
    private WebElement machineTypeSelector;

    //TODO: figure out how to implement this
//    @FindAll({@FindBy(xpath = "//md-option[@ng-repeat='instance in typeInfo']")})
//    private List<WebElement> machineTypeList;
//    private WebElement e2Standard8 = machineTypeList.get(5);


    public void inputNumberOfInstance(int number) throws InterruptedException {
        Thread.sleep(15000);
//        WaiterWrapperClass.waitForElement(driver, numberOfInstanceField);
//        numberOfInstanceField.click();
        numberOfInstanceField.sendKeys(toString(number));
    }

    private CharSequence toString(int number) {
        return null;
    }

    public void selectMachineType() {
        machineTypeSelector.click();
//        e2Standard8.click();
    }

}
