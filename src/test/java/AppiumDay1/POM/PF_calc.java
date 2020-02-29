package AppiumDay1.POM;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

import java.time.Duration;

public class PF_calc {



    private static final String packageName="com.android.calculator2:id/";
     AndroidDriver driver;

    public PF_calc(AndroidDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)),this);
    }

    @AndroidFindBy(id=packageName+"digit_5")
    private MobileElement thisIs5;

    @AndroidFindBy(id=packageName+"op_add")
    private MobileElement thisIsAdd;

    @AndroidFindBy(id=packageName+"eq")
    private MobileElement thisIsEqual;

    @AndroidFindBy(id=packageName+"result")
    private MobileElement thisIsResult;





}
