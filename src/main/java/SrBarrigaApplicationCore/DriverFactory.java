package SrBarrigaApplicationCore;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver(){
        if(driver == null){
            createDriver();
        }
        return driver;
    }
    public static void createDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("deviceName","@Nexus_5X_API_25");
        desiredCapabilities.setCapability("automationName","uiautomator2");
        desiredCapabilities.setCapability("appPackage","com.ctappium");
        desiredCapabilities.setCapability("appActivity","com.ctappium.MainActivity");

        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public static void killDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
