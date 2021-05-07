package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WaiterWrapperClass;

public class HomePage extends BasePage {

    private static final String HOMEPAGE_URL = "https://cloud.google.com/";

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement inputSearchField;

//    @FindBy(id = "select2-postform-expiration-container")
//    private WebElement pasteExpirationSelect;
//
//    @FindBy(id = "postform-name")
//    private WebElement pasteNameField;
//
//    @FindBy(xpath = "//div[@class='form-group field-postform-format']/label[@class='control-label col-sm-3']")
//    private WebElement labelSyntaxHighlighting;
//
//    @FindBy(xpath = "//div[@class='content__title -no-border']")
//    private WebElement textLabel;
//
//    @FindBy(xpath = "//*[@id='select2-postform-format-container']")
//    private WebElement syntaxHighlighting;
//
//    @FindBy(xpath = "//span[@class='select2-results']/ul/li[3]")
//    private WebElement tenMinutes;
//
//    @FindBy(xpath = "//button[@type='submit']")
//    private WebElement submitButton;
//
//    @FindBy(xpath = "//span[@class='select2-results']/ul/li[2]/ul/li[1]")
//    private WebElement bashSyntaxValue;




    public HomePage openPage() {
        driver.get(HOMEPAGE_URL);
        WaiterWrapperClass.waitForElement(driver, inputSearchField);
        return this;
    }

    public ResultPage searchAppName(String text) throws InterruptedException {
        inputSearchField.click();
        inputSearchField.sendKeys(text);
        inputSearchField.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        return new ResultPage(driver);
    }
/*
    public void syntaxHighlightingBash() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", textLabel);
        syntaxHighlighting.click();
//        WaiterWrapperClass.waitForElement(driver, bashSyntaxValue);
        bashSyntaxValue.click();

    }

    public void chooseExpiration10Min() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", labelSyntaxHighlighting);
        pasteExpirationSelect.click();
        WaiterWrapperClass.waitForElement(driver, tenMinutes);
        tenMinutes.click();

    }

    public void sendTextToPasteName(String text) {
        pasteNameField.click();
        pasteNameField.sendKeys(text);
    }

    public void createNewPaste() {
        submitButton.click();
    }

*/

}