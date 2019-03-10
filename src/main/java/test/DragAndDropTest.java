package test;

import SrBarrigaApplicationCore.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.DragAndDropPage;
import page.MenuPage;

public class DragAndDropTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private DragAndDropPage drag = new DragAndDropPage();

    private String[] estadoInicial = new String[]{"Esta", "é uma lista", "Drag em Drop!", "Faça um clique longo,", "e arraste para", "qualquer local desejado."};
    private String[] estadoIntermediario = new String[]{"é uma lista", "Drag em Drop!", "Faça um clique longo,", "e arraste para", "Esta", "qualquer local desejado."};
    private String[] estadoFinal = new String[]{"Faça um clique longo,", "é uma lista", "Drag em Drop!", "e arraste para", "Esta", "qualquer local desejado."};

    @Test
    public void deveEfetuarDragNDrop() throws InterruptedException {
        //acessar menu
        menu.acessaDragNDrop();

        //verificar estado inicial
        Assert.assertArrayEquals(estadoInicial, drag.obterLista());

        //arrastar "Esta" para "e arraste para"
        drag.arrastar("Esta", "e arraste para");
        //verificar esta intermediário
        Assert.assertArrayEquals(estadoIntermediario, drag.obterLista());
        //arrastar "Faça um clique longo," para "é uma lista"
        drag.arrastar("Faça um clique longo,", "é uma lista");
        //verificar estado final
        Assert.assertArrayEquals(estadoFinal, drag.obterLista());
    }
}
