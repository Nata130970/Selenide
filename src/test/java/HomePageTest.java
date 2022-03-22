import Page.Configuration;
import Page.HomePage;
import Page.TestBase;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HomePageTest extends TestBase {

    @Test
    public void duckClickRubberDarkTest() {
        By title;
        title = HomePage.duckClickRubberDark();
        $(title).shouldHave(text("Rubber Ducks"));
    }

    @Test
    public void duckClickDeliveryInformationTest() {
        ElementsCollection footer ;
        String foo="";
        footer = HomePage.duckClickDeliveryInformation();
        for( WebElement el : footer){
            foo = foo + " " + (el.getText());
        }
        assertTrue(foo.contains("Delivery Information"),"Delivery Information not found");
    }

    @Test
    public void duckClickTermConditionTest() {

        String footer = "";
        footer = HomePage.duckClickTermCondition();
        assertTrue(footer.contains("Terms & Conditions"),"Terms & Conditions not found");
    }
}
