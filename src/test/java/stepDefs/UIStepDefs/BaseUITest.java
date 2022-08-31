package stepDefs.UIStepDefs;

import UI.pageObjects.google.GoogleIndexPage;
import UI.pageObjects.google.ResultPage;
import UI.pageObjects.yandex.YandexIndexPage;
import UI.pageObjects.yandex.LoginPage;
import UI.pageObjects.yandex.MailPage;

public class BaseUITest {

    LoginPage loginPage = new LoginPage();
    YandexIndexPage indexPage = new YandexIndexPage();
    MailPage mailPage = new MailPage();
    GoogleIndexPage googleIndexPage = new GoogleIndexPage();
    ResultPage resultPage =new ResultPage();
}
