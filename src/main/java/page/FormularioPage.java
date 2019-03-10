package page;


import SrBarrigaApplicationCore.BasePage;
import SrBarrigaApplicationCore.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class FormularioPage extends BasePage{


    public void escreverNome(String nome){
        escrever(MobileBy.AccessibilityId("nome"),nome);
    }

    public String obterNome(){
        return obterTexto(MobileBy.AccessibilityId("nome"));
    }

    public void selecionarCombo(String valor){
        selecionarCombo(MobileBy.AccessibilityId("console"), valor);
    }

    public String obterValorCombo(){
        return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
    }

    public void clicarCheck(){
        isCheckMarcado(By.className("android.widget.CheckBox"));
    }

    public void clicarSwitch(){
        isCheckMarcado(By.className("android.widget.Switch"));
    }

    public boolean isCheckMarcado(){
        return isCheckMarcado(By.className("android.widget.CheckBox"));
    }

    public boolean isSwitchMarcado(){
        return isCheckMarcado(By.className("android.widget.Switch"));
    }

    public void Salvar(){
        clicarPorTexto("SALVAR");
    }

    public void clicarSeekBar(double posicao) {
        MobileElement seek = DriverFactory.getDriver().findElement(MobileBy.AccessibilityId("slid"));
        int y = seek.getLocation().y + (seek.getSize().height / 2);
        System.out.println(y);

        int x = (int) (seek.getLocation().x + (seek.getSize().width * posicao));
        System.out.println(x);

        tap (x,y);
    }
    }


