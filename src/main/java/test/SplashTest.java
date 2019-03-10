package test;


import SrBarrigaApplicationCore.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.MenuPage;
import page.SplashPage;

public class SplashTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private SplashPage splash = new SplashPage();

    @Test
    public void deveAguardarSplashSumir(){

        //acessar menu splash

        menu.acessaSplash();

        //verificar que o spalsh está sendo exibido
        splash.isTelaSplashVisivel();

        //aguardar saida do splash

        splash.aguardarSplashSumir();

        //verificar que o formulario está aparecendo

        Assert.assertTrue(menu.existeElementoporTexto("Formulário"));

    }


}
