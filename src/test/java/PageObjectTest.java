import org.junit.jupiter.api.Test;
import pages.BaseFunc;
import pages.HomePage;

public class PageObjectTest {

    private BaseFunc baseFunc = new BaseFunc();

    public PageObjectTest() throws InterruptedException {
    }

    @Test
    public void poTest() {
        baseFunc.goToUrl("http://www.wandoofinance.com/");

//        HomePage homePage = new HomePage(baseFunc);
//        homePage.clickHomeBtn();
        HomePage homePage = new HomePage(baseFunc);
        homePage.clickAboutBtn();
    }
}

