package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class base {
    WebDriver driver;
    Properties prop;

    public WebDriver initialiseDriver(String browserName) {
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            ;
            driver = new EdgeDriver();
        } else
            System.out.println(browserName + "Browser is invalid, please enter the correct name");
        return driver;

    }

    public Properties initialiseProperties() {
        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream("C:\\Users\\visha\\IdeaProjects\\Registraion\\Registration\\src\\" + "test\\resources\\config.properties");
            prop.load(ip);

        } catch (FileNotFoundException e) {
            System.out.println("config file is missing, please check ...");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("properties could not be loaded");
            e.printStackTrace();
        }
        return prop;


    }
}