package page;

import SrBarrigaApplicationCore.BasePage;
import SrBarrigaApplicationCore.DriverFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

public class CliquesPage extends BasePage {

    public void cliqueLongo(){
        new TouchAction(DriverFactory.getDriver())
        .longPress(PointOption.point().DriverFactory.getDriver().findElementByXPath("//*[@text='Clique Longo']"));
    }

    public String obterTextoCampo(){
        return DriverFactory.getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
    }

}

