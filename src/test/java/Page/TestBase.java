package Page;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import static com.codeborne.selenide.Selenide.*;


public class TestBase {

    protected static Logger logger = Logger.getLogger(TestBase.class);

    @BeforeTest
    public void setup(){
        open(Configuration.baseURL);

    }

}
