package page;

import SrBarrigaApplicationCore.BasePage;
import SrBarrigaApplicationCore.DriverFactory;
import org.openqa.selenium.By;

import java.util.Set;


public class WebViewPage extends BasePage {

    public void entrarContextoWeb(){
       Set<String> contextHandles =  DriverFactory.getDriver().getContextHandles();
       //for (String valor = contextHandles){
           //System.out.println(valor);
       //}
       DriverFactory.getDriver().context((String) contextHandles.toArray()[1]);
    }

    public void setEmail(String valor){
        DriverFactory.getDriver().findElement(By.id("email")).sendKeys(valor);
    }

    public void setSenha(String valor){
        DriverFactory.getDriver().findElement(By.id("senha")).sendKeys(valor);
    }

    public void entrar(){
        DriverFactory.getDriver().findElement(By.xpath("//button[@type='submit']"));
    }

    public String getMensagem(){
       return obterTexto(By.xpath("//div[@class='alert-success']"));
    }


    public void sairContextoWeb(){
        DriverFactory.getDriver().context((String) DriverFactory.getDriver().getContextHandles().toArray()[0]);
    }


}
