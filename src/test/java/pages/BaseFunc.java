package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseFunc {

    private WebDriver driver;

    public BaseFunc() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void goToUrl(String url) {
        if (url.startsWith("http://") || url.startsWith("https://")) {

        } else {
            url = "http://" + url;
        }
        driver.get(url);

    }
    public void clickHomeBtn(By HOME) {
        driver.findElement(HOME).click();
    }

    public void clickAboutBtn(By ABOUT) {
        driver.findElement(ABOUT).click();
    }
}