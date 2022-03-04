package registrationpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.utilities;

public class register {
    WebDriver driver;
    static utilities utilities;

    By firstname = By.id("firstname");
    By lastname = By.id("Lastname");
    By day = By.name("day");
    By month = By.name("month");
    By year = By.name("year");
    By email = By.id("email");
    By companyname = By.id("companyName");
    By newslettter = By.id("newsletter");
    By password = By.id("password");
    By cpassword = By.id("cpassword");


    public register(WebDriver driver) {
        this.driver = driver;
        utilities = new utilities(driver);
    }

    public void doregister(By firstname, String lastname, String day, String month, int year, String companyName, String password, String cpassword) {

        Object fname = null;
        utilities.doSendkeys(firstname,fname);
        Object lname = null;
        utilities.doSendkeys(lastname,lname);
        String dbirth = null;
        utilities.doSendkeys(day, dbirth);
        String mbirth = null;
        utilities.doSendkeys(month,mbirth );
        String ybirth = null;
        utilities.doSendkeys(year,ybirth);
        String company = null;
        utilities.doSendkeys(companyName, company);
        utilities.doClick(newslettter);
        String pword = null;
        utilities.doSendkeys(password, pword);
        String cpword = null;
        utilities.doSendkeys(cpassword, cpword);

    }public boolean registerButton()
    {return driver.findElement(registerButton().isDisplayed();}
        



}