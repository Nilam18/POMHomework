import Base.base;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import registrationpage.register;

import java.util.Properties;


public class registrationpagetest {
base base1;
Properties prop;
WebDriver driver;
register register;

@BeforeTest
    public void openBrowser() {
    base1 = new base();
    prop = base1.initialiseProperties();
    String browser = prop.getProperty("browser");
    driver = base1.initialiseDriver(browser);
    driver.get(prop.getProperty("url"));
    register = new register(driver);
}
@Test
public void registerpagetest(){
    register.doregister(prop.getProperty("firstname"),prop.getProperty("lastname"),prop.getProperty("day"),prop.getProperty("month"),prop.getProperty("year"),prop.getProperty("companyName")prop.getProperty("password"),prop.getProperty("cpassword"));
prop.getProperty("firstname");
prop.getProperty("lastname");
    prop.getProperty("day");
    prop.getProperty("month");
    prop.getProperty("year");
    prop.getProperty("companyName");
    prop.getProperty("newsletter");
    prop.getProperty("password");
    prop.getProperty("cpassword");
    }


    }

