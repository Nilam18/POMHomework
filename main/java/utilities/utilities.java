package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class utilities {
    WebDriver driver;

    public WebElement getElement(By locator) {
                WebElement element = driver.findElement(locator);
                return element;

    }
    public void doSendkeys(By locator, String value) {
        getElement(locator).sendKeys(value);
    }
    public void doClick(By locator){
        getElement(locator).click();
    }

    public String doGetText(By locator) {
        return getElement(locator).getText();
    }
    public static void selectvaluefromDropDown(WebElement element, String value){
        Select select =new Select(element);
        select.selectByVisibleText(value);





    }


}
