package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class initialiseProperties {
    
    public Properties initialseProperties() {

        Properties prop = new Properties();
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