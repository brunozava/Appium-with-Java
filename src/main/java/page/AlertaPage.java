package page;

import SrBarrigaApplicationCore.BasePage;
import org.openqa.selenium.By;



public class AlertaPage extends BasePage {

    public void clicarAlertaConfirm(){
        clicarPorTexto("ALERTA CONFIRM");
    }

    public String obterTituloAlerta(){
        return obterTexto(By.id("android:id/alertTitle"));
    }

    public String obterMensagemAlerta(){
        return obterTexto(By.id("android:id/message"));
    }

    public void confirmarAlerta(){
        clicarPorTexto("CONFIRMAR");
    }

    public void sairAlerta(){
        clicarPorTexto("SAIR");
    }
    public void clicarAlertaSimples(){
        clicarPorTexto("ALERTA SIMPLES");
    }

    public void clicarForaCaixa() throws InterruptedException {
        wait(1);
        tap(100, 150);
    }

}
