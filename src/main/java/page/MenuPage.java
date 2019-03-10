package page;


import SrBarrigaApplicationCore.BasePage;
import SrBarrigaApplicationCore.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage extends BasePage {

    public void acessaFormulario(){
        clicarPorTexto("Formulário");
    }

    public void acessaSplash(){
        clicarPorTexto("Splash");
    }

    public void acessaAlerta(){
        clicarPorTexto("Alertas");
    }

    public void acessaAba(){
        clicarPorTexto("Abas");
    }

    public void acessaAccordion(){
        clicarPorTexto("Accordion");
    }
    public void acessaCliques(){
        clicarPorTexto("Cliques");
    }

    public void acessaSwipe(){
        clicarPorTexto("Swipe");
    }

    public void acessaSwipeList(){
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@Text='Formulário']")));
        scroll(0.9, 0.1);
        clicarPorTexto("Swipe List");
    }

    public void acessaDragNDrop(){
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@Text='Formulário']")));
        scroll(0.9, 0.1);
        clicarPorTexto("Drag and drop");
    }

    public void acessaSBHibrido(){
        clicarPorTexto("SeuBarriga Híbrido");
    }


}
