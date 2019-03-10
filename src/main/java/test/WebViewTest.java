package test;


import SrBarrigaApplicationCore.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import page.MenuPage;
import page.WebViewPage;

public class WebViewTest extends BaseTest{

    private MenuPage menu = new MenuPage();
    private WebViewPage web = new WebViewPage();

    @Test
    public void deveRealizarLogin() throws InterruptedException {
        //acessar o menu
        menu.acessaSBHibrido();
        wait(3000);
        web.entrarContextoWeb();

        //preencher email
        web.setEmail("zava@zava.com");

        //senha
        web.setSenha("130887");
        //entrar
        web.entrar();

        //verificar msg sucesso
        Assert.assertEquals("Bem vindo, Zava!", web.getMensagem());
    }

    @After
    public void tearDown(){
        web.sairContextoWeb();
    }
}
