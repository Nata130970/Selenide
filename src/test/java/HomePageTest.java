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
        logger.info("Start test duckClickRubberDarkTest");
        title = HomePage.duckClickRubberDark();
        $(title).shouldHave(text("Rubber Ducks"));
        logger.info("End test duckClickRubberDarkTest");
    }

    @Test
    public void duckClickDeliveryInformationTest() {
        ElementsCollection footer ;
        logger.info("Start test duckClickDeliveryInformationTest");
        footer = HomePage.duckClickDeliveryInformation();
        $$(footer).get(1).shouldHave(text("Delivery Information"));
    }

    @Test
    public void duckClickTermConditionTest() {

        String footer = "";
        logger.info("Start test duckClickTermConditionTest");
        footer = HomePage.duckClickTermCondition();
        assertTrue(footer.contains("Terms & Conditions"),"Terms & Conditions not found");
        logger.info(String.format("TextFooter: %s ",footer));
    }
}
