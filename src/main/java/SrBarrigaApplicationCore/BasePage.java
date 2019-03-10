package SrBarrigaApplicationCore;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import javax.xml.datatype.Duration;
import java.util.List;

public class BasePage {


        public void escrever(By by, String texto){
            DriverFactory.getDriver().findElement(by).sendKeys(texto);
        }

        public String obterTexto(By by){
            return DriverFactory.getDriver().findElement(by).getText();
        }

        public void clicar(By by){
            DriverFactory.getDriver().findElement(by).click();
        }

        public void clicarPorTexto(String texto){
            clicar(By.xpath("//*[@text='"+texto+"']"));
        }


        public void selecionarCombo(By by, String valor){
            DriverFactory.getDriver().findElement(by).click();
            clicarPorTexto(valor);
            //DriverFactory.getDriver().findElement(By.xpath("//android.widget.CheckedTextView[@text='"+valor+"']")).click();
        }

        public boolean isCheckMarcado(By by){
            return DriverFactory.getDriver().findElement(by).getAttribute("checked").equals("true");
        }

        public boolean existeElementoporTexto(String texto){
            List<MobileElement> elementos = DriverFactory.getDriver().findElements(By.xpath("//*[@text='"+texto+"']"));
            return elementos.size() > 0;
        }

        public void tap(int x, int y) {
            new TouchAction(DriverFactory.getDriver()).tap(PointOption.point(x, y)).perform();
        }

        public void scroll(double inicio, double fim){
            Dimension size = DriverFactory.getDriver().manage().window().getSize();

            int x = size.width / 2;

            int start_y = (int) (size.height * inicio);
            int end_y = (int) (size.height * fim);

            new TouchAction(DriverFactory.getDriver())
                    .press(x, start_y)
                    .waitAction(Duration.ofMillis(500))
                    .moveTo(x, end_y)
                    .release()
                    .perform();
        }

        public void swype(double inicio, double fim){
            Dimension size = DriverFactory.getDriver().manage().window().getSize();

            int y = size.height / 2;

            int start_x = (int) (size.width * inicio);
            int end_x = (int) (size.width * fim);

            new TouchAction(DriverFactory.getDriver())
                    .press(start_x, y)
                    .waitAction(Duration.ofMillis(500))
                    .moveTo(end_x y)
                    .release()
                    .perform();

        }
    }
