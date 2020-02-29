package AppiumDay1.POM;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeTest;

public class Test_calc {
    AndroidDriver driver;


    @BeforeTest
    public void setUp()
    {
        PF_calc pf_calc =new PF_calc(driver);
        pf_calc.thisis5.click();

    }

}
