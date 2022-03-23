import Page.RubberDucksPage;
import Page.TestBase;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collections;
import static org.testng.Assert.assertTrue;

public class RubberDucksPageTest extends TestBase {

    @Test
    public void duckSubcategoryTest() {
        int result=0;

        result = RubberDucksPage.duckSubcategory();
        assertTrue((result==3),String.format("Result= %s expRes = 3", result));
    }

    @Test
    public void duckSortNameTest(){

        ArrayList<String> nameSort;
        ArrayList<String> name;
        logger.info("Start test duckSortNameTest");
        name = RubberDucksPage.duckSortName();
        nameSort = (ArrayList)name.clone();
//        Collections.swap(nameSort, 0, 4);
        Collections.sort(nameSort);
        assertTrue(name.equals(nameSort),String.format("Exp: %s Res: %s",nameSort,name));
        logger.info(String.format("ExpName: %s \n ActualName: %s",nameSort,name));
    }

    @Test
    public void duckSortPriceTest() {

        ArrayList<Float> priceSort;
        ArrayList<Float> price;
        price = RubberDucksPage.duckSortPrice();
        priceSort = (ArrayList)price.clone();
        Collections.sort(priceSort);
        assertTrue(price.equals(priceSort),String.format("Exp: %s Res: %s",priceSort,price));
    }

    @Test
    public void duckNewLabelTest() {
        int[]  Result = new int[2];
        Result = RubberDucksPage.duckNewLabel();
        assertTrue(Result[0] == Result[1],String.format("Exp: %s Res: %s ",Result[0],Result[1]));
        logger.info(String.format("ExpLabel: %s ActualLabel: %s",Result[0],Result[1]));
    }

}
