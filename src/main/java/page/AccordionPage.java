package page;

import SrBarrigaApplicationCore.BasePage;

public class AccordionPage extends BasePage {

    public void clicarOp1(){
        clicarPorTexto("Opção 1");
    }

    public boolean obterValorOp1(){
        return existeElementoporTexto("Esta é a descrição da opção 1");
    }

}
