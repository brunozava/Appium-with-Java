package test;

import SrBarrigaApplicationCore.BasePage;
import SrBarrigaApplicationCore.BaseTest;
import SrBarrigaApplicationCore.DriverFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.AlertaPage;
import page.MenuPage;

public class OpcaoEscondida extends BaseTest {

    private MenuPage menu = new MenuPage();
    private AlertaPage alerta = new AlertaPage();

    @Test
    public void deveEncontrarOpcaoEscondida(){
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
        //scrolldown
        menu.scroll(0.9, 0.1);
        //clicar menu
        menu.clicarPorTexto("Opção bem escondida");

        //verificar mensagem
        Assert.assertEquals("Você achou essa opção", alerta.obterMensagemAlerta());

        //sair da mensagem
        menu.clicarPorTexto("OK");
    }

}
