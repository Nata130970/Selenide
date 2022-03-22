package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import static com.codeborne.selenide.Selenide.*;

public class RubberDucksPage {

    WebDriver driver;
    private static By buttonRubberDarkLocator = By.cssSelector("#site-menu ul > li.category-1");
    private static By buttonSubCategoryLocator = By.cssSelector("#site-menu ul > li.category-1 > ul > li.category-2 ");
    private static By wrapperSubCategoryProductsLocator = By.xpath("//li[@class='product row shadow hover-light']");
    private static By stickerSubCategoryLocator = By.xpath(".//div[contains(@class,'sticker')]");
    private static By buttonRubberDarkNameLocator = By.xpath("//nav[@class='filter']/a[@class='button'][text()='Name']");
    private static By productsRubberDarkLocator = By.xpath("//ul[@class='listing-wrapper products']/" +
            "li[@class='product column shadow hover-light']//div[@class='name']");
    private static By buttonPriceLocator = By.xpath("//nav[@class='filter']//*[contains(@class,'button')][text()='Price']");
    private static By productsPriceLocator = By.xpath("//ul[@class='listing-wrapper products']/" +
            "li[@class='product column shadow hover-light']//span[@class='price']");
    private static By stickerNewLocator =By.xpath("//div[@class='sticker new']");


    public static int duckSubcategory() {     // Actions
        String sticker;
        int result =0;
        String name;
        actions().moveToElement($(buttonRubberDarkLocator)).perform();
        actions().click($(buttonSubCategoryLocator)).perform();

        for (WebElement el : $$(wrapperSubCategoryProductsLocator)) {
            name = el.findElement(By.className("name")).getText();
            sticker = el.findElement(stickerSubCategoryLocator).getText();
            if  ((name.equals("Yellow Duck")) && ( sticker.equals("SALE"))) result++;
            if  ((name.equals("Green DucK")) && ( sticker.equals("NEW"))) result++;
            if  ((name.equals("Розовая уточка")) && ( sticker.equals("NEW")))  result++;
        }
        return  result;
    }

    public static ArrayList duckSortName(){
        ArrayList<String> name = new ArrayList<>();

        $(buttonRubberDarkLocator).click();
        $(buttonRubberDarkNameLocator).click();
        for (WebElement element :  $$(productsRubberDarkLocator)){
            name.add(element.getText());
        }
        return  name;
    }
    public static ArrayList duckSortPrice() {
        ArrayList<Float> price = new ArrayList<>();;

        $(buttonRubberDarkLocator).click();
        $(buttonPriceLocator).click();
        for (WebElement element :  $$(productsPriceLocator)){
            String e = element.getText();
            Float a = Float.valueOf(e.substring(0,e.indexOf("€")-1));
            price.add(a);
        }
        return price;
    }
    public static int[] duckNewLabel() {

        int countLabel = 0;
        int[]  Result = new int[2];
        $(buttonRubberDarkLocator).click();

        for (WebElement element : $$(stickerNewLocator)) {
            if (element.getText().equals("NEW"))
                countLabel++;
        }
        Result[0] = $$(stickerNewLocator).size();
        Result[1] = countLabel;
        return Result;
    }

}