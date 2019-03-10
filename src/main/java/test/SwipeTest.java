package test;

import SrBarrigaApplicationCore.BaseTest;
import SrBarrigaApplicationCore.DriverFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.MenuPage;
import page.SwipePage;

public class SwipeTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private SwipePage swipe = new SwipePage();

    @Test
    public void deveRealizarSwipe(){

        //acessar menu
        menu.acessaSwipe();

        //verificar texto a esquerda
        Assert.assertTrue(menu.existeElementoporTexto("a esquerda"));

        //swipe para direita
        swipe.swype(0.9, 0.1);

        //verificar texto 'e veja se'
        Assert.assertTrue(menu.existeElementoporTexto("E veja se"));

        //clicar botão direito
        menu.clicarPorTexto(">");

        //verificar texto 'chegar até o fim'
        Assert.assertTrue(menu.existeElementoporTexto("Chegar até o fim"));

        //swipe esquerda
        swipe.swype(0.1, 0.9);

        //clicar botão esquerda
        menu.clicarPorTexto("<");

        //verificar texto a esquerda
        Assert.assertTrue(menu.existeElementoporTexto("A esquerda"));
    }
}
