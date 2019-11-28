package pages;

import org.openqa.selenium.By;

public class HomePage {
    private BaseFunc baseFunc;
    private final By HOME = By.xpath(".//li[@class='nav-item active NavigationPanel-style__navItem___1SEQ- NavigationPanel-style__activeNavItem___1qoTG']/a");
    private final By ABOUT = By.xpath(".//li[@class='nav-item NavigationPanel-style__navItem___1SEQ-']/a[@href='#/about']");

    public HomePage(BaseFunc baseFunc) { //konstruktor
        this.baseFunc = baseFunc;
    }

    public void clickHomeBtn() {
        baseFunc.clickHomeBtn(HOME);
    }

    public void clickAboutBtn() {
        baseFunc.clickAboutBtn(ABOUT);
    }
}
