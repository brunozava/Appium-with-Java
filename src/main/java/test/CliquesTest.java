package test;

import SrBarrigaApplicationCore.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.CliquesPage;
import page.MenuPage;

public class CliquesTest extends BaseTest {
    private MenuPage menu = new MenuPage();
    private CliquesPage cliques = new CliquesPage();

@Test
    public void deveRealizarCliqueLongo(){
        //acessar cliques
        menu.acessaCliques();
        //clique longo
        cliques.cliqueLongo();
        //verificar texto
    Assert.assertEquals("Clique Longo", cliques.obterTextoCampo());
}

@Test
    public void deveRealizarCliqueDuplo(){
    //acessar cliques
    menu.acessaCliques();

    //clique duplo
    cliques.clicarPorTexto("Clique duplo");
    cliques.clicarPorTexto("Clique duplo");

    //verificar texto
    Assert.assertEquals("Duplo Clique", cliques.obterTextoCampo());

}
}
