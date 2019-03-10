package test;

import SrBarrigaApplicationCore.BaseTest;

import org.junit.Assert;
import org.junit.Test;
import page.AlertaPage;
import page.MenuPage;

public class AlertaTest extends BaseTest {
    private MenuPage menu = new MenuPage();
    private AlertaPage alerta = new AlertaPage();


    @Test
    public void deveConfirmarAlerta(){

        //acessar menu alerta
        menu.acessaAlerta();

        // clicar alert confirm
        alerta.clicarAlertaConfirm();

        //verificar textos
        Assert.assertEquals("Info", alerta.obterTituloAlerta());
        Assert.assertEquals("Confirma a operaçao?", alerta.obterMensagemAlerta());

        //confirmar alertas
        alerta.confirmarAlerta();

        //verificar nova mensagem
        Assert.assertEquals("Confirmado", alerta.obterMensagemAlerta());

        //sair
        alerta.sairAlerta();
    }

    @Test
    public void deveClicarForaAlerta(){
        //acessar alerta
        menu.acessaAlerta();
        //clicar alerta simples
        alerta.clicarAlertaSimples();

        //clicar fora caixa
        alerta.clicarForaCaixa();

        //verificar que a mensagem nao esta presente
        Assert.assertFalse(alerta.existeElementoporTexto("Pode clicar no OK ou fora da caixa para sair"));
    }
}
