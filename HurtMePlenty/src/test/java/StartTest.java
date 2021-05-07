import org.testng.annotations.Test;
import page.HomePage;
import page.ResultPage;


/*
Hurt Me Plenty
При выполнении задания необходимо использовать возможности Selenium WebDriver, юнит-тест фреймворка
и концепцию Page Object. Автоматизировать следующий сценарий:

1. Открыть https://cloud.google.com/
2. Нажав кнопку поиска по порталу вверху страницы, ввести в поле поиска"Google Cloud Platform Pricing Calculator"
3. Запустить поиск, нажав кнопку поиска.
4. В результатах поиска кликнуть "Google Cloud Platform Pricing Calculator" и перейти на страницу калькулятора.
5. Активировать раздел COMPUTE ENGINE вверху страницы
6. Заполнить форму следующими данными:
    * Number of instances: 4
    * What are these instances for?: оставить пустым
    * Operating System / Software: Free: Debian, CentOS, CoreOS, Ubuntu, or other User Provided OS
    * VM Class: Regular
    * Instance type: n1-standard-8    (vCPUs: 8, RAM: 30 GB)
    * Выбрать Add GPUs
        * Number of GPUs: 1
        * GPU type: NVIDIA Tesla V100
    * Local SSD: 2x375 Gb
    * Datacenter location: Frankfurt (europe-west3)
    * Commited usage: 1 Year
7. Нажать Add to Estimate
8. Проверить соответствие данных следующих полей: VM Class, Instance type, Region, local SSD, commitment term
9. Проверить что сумма аренды в месяц совпадает с суммой получаемой при ручном прохождении теста.

 */

public class StartTest extends BaseTest {

    public static HomePage homePage;
    public static ResultPage resultPage;

    String text1 = "Google Cloud Platform Pricing Calculator";
//    String text2 = "how to gain dominance among developers";

    @Test
    public void test1() {
        homePage = new HomePage(driver);
        homePage.openPage();
    }

    @Test
    public void test2() throws InterruptedException {
        homePage.searchAppName(text1);
    }

    @Test
    public void test3() throws InterruptedException {
        resultPage.openCalcPage();
    }
//
//    @Test
//    public void test4() {
//        homePage.chooseExpiration10Min();
//    }
//
//    @Test
//    public void test5() {
//        homePage.sendTextToPasteName(text2);
//    }
//
//    @Test
//    public void test6() {
//        homePage.createNewPaste();
//    }
//
//    @Test
//    public void test7() {
//        Assert.assertEquals(driver.getTitle(), "how to gain dominance among developers");
//    }
//    @Test
//    public void test8() {
//        WebElement result = driver.findElement(By.xpath("//ol[@class='bash']"));
//        String str = result.getText();
//        System.out.println(str);
//        Assert.assertEquals(str,"git config --global user.name  \"New Sheriff in Town\"\n" +
//                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
//                "git push origin master --force");
//    }
}
