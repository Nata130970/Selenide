package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class TestBase {
    protected WebDriver driver;

    @BeforeTest
    public void setup(){
        open(Configuration.baseURL);
    }

}
