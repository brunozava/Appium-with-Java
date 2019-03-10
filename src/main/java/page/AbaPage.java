package page;

import SrBarrigaApplicationCore.BasePage;


public class AbaPage extends BasePage {

    public boolean isAba1(){
        return existeElementoporTexto("Este é o conteúdo da Aba 1");
    }

    public void clicarAba2(){
        clicarPorTexto("ABA 2");
    }

    public boolean isAba2(){
        return existeElementoporTexto("Este é o conteúdo da Aba 2");
    }
}

