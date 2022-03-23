package Page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import static com.codeborne.selenide.Selenide.*;


public class TestBase {
//    protected WebDriver driver;

    @BeforeTest
    public void setup(){
        open(Configuration.baseURL);
    }

}
