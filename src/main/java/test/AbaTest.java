package test;

import SrBarrigaApplicationCore.BaseTest;
import org.junit.Assert;
import page.AbaPage;
import page.MenuPage;

public class AbaTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private AbaPage aba = new AbaPage();

    public void deveInteragirComAbas(){

        //acessar menu abas
        menu.acessaAba();

        //verificar que  está na aba 1
        Assert.assertTrue(aba.isAba1());

        // clicar na aba 2
        aba.clicarAba2();

        // verificar que está na aba 2
        Assert.assertTrue(aba.isAba2());

    }

}
