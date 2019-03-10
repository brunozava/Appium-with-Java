package test;

import SrBarrigaApplicationCore.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.AbaPage;
import page.AccordionPage;
import page.MenuPage;

public class AccordionTest extends BaseTest {
    private MenuPage menu = new MenuPage();
    private AccordionPage accordion = new AccordionPage();


    @Test
    public void deveInteragirComAccordion(){

        //Acessar menu
        menu.acessaAccordion();

        //clicar op1
        accordion.clicarOp1();

        //verificar texto op 1
        Assert.assertTrue(accordion.obterValorOp1());
    }

    @Test
    public void deveAlterarData(){
        menu.clicarPorTexto("01/01/2000");
        menu.clicarPorTexto("20");
        menu.clicarPorTexto("OK");
        Assert.assertTrue(menu.existeElementoporTexto("20/01/2000"));
    }

}
