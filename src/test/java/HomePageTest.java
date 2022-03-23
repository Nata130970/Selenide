import Page.HomePage;
import Page.TestBase;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
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
        footer = HomePage.duckClickDeliveryInformation();
        $$(footer).get(1).shouldHave(text("Delivery Information"));

    }

    @Test
    public void duckClickTermConditionTest() {

        String footer = "";
        footer = HomePage.duckClickTermCondition();
        assertTrue(footer.contains("Terms & Conditions"),"Terms & Conditions not found");
    }
}
