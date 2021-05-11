import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.ResultPage;

import java.util.Arrays;
import java.util.List;


/*
Bring It On
При выполнении задания необходимо использовать возможности Selenium WebDriver, юнит-тест фреймворка
и концепцию Page Object. Автоматизировать следующий сценарий:

Открыть https://pastebin.com  или аналогичный сервис в любом браузере
Создать New Paste со следующими деталями:
* Код:

git config --global user.name  "New Sheriff in Town"
git reset $(git commit-tree HEAD^{tree} -m "Legacy code")
git push origin master --force
* Syntax Highlighting: "Bash"

* Paste Expiration: "10 Minutes"

* Paste Name / Title: "how to gain dominance among developers"

3. Сохранить paste и проверить следующее:

* Заголовок страницы браузера соответствует Paste Name / Title

* Синтаксис подвечен для bash

* Проверить что код соответствует введенному в пункте 2
 */

public class Test1 extends BaseTest {

    public static HomePage homePage;
    public static ResultPage resultPage;

    String text1 = "git config --global user.name  \"New Sheriff in Town\"\n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
            "git push origin master --force";
    String text2 = "how to gain dominance among developers";
    List<String> expectedText = Arrays.asList(
            "\"git config --global user.name  \\\"New Sheriff in Town\\\"\\n\"",
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n",
            "git push origin master --force");
//        for (String s:expectedText) {
//        System.out.println(s);
//    }

    @Test
    public void test1() {
        homePage = new HomePage(driver);
        homePage.openPage();
    }

    @Test
    public void test2() {
        homePage.sendTextToNewPaste(text1);
    }

    @Test
    public void test3() {
        homePage.syntaxHighlightingBash();
    }

    @Test
    public void test4() {
        homePage.chooseExpiration10Min();
    }

    @Test
    public void test5() {
        homePage.sendTextToPasteName(text2);
    }

    @Test
    public void test6() {
        resultPage = homePage.createNewPaste();
    }

    //TODO: realize how to get title of new page
    @Test
    public void test7() {
        String title = resultPage.getTitle();
        Assert.assertEquals(title, "how to gain dominance among developers");
    }

    //TODO: realize how to get all text from multi-line field
    @Test
    public void test8() {
//        WebElement result = driver.findElement(By.xpath("//ol[@class='bash']"));
//        String str = result.getText();
//        resultPage.getTextFromField()
//        System.out.println(str);
//        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(resultPage.getTextFromField(), expectedText.get(0));
//        }
//        Assert.assertEquals(str,"git config --global user.name  \"New Sheriff in Town\"\n" +
//                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
//                "git push origin master --force");
    }
}
