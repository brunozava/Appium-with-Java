package test;


import java.net.MalformedURLException;



import SrBarrigaApplicationCore.BaseTest;

import SrBarrigaApplicationCore.DriverFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.FormularioPage;
import page.MenuPage;


public class AppTesting extends BaseTest {

  private AndroidDriver<MobileElement> driver;
  private MenuPage menu = new MenuPage();
  private FormularioPage formulario = new FormularioPage();

  @Before
  public void inicializarAppium() throws MalformedURLException {
        driver = DriverFactory.getDriver();

        //Selecionar fomulario

      //dsl.clicarPorTexto("Formulário");

      menu.acessaFormulario();

        //List<MobileElement> elementosEncontrados = driver.findElements(By.className("android.widget.TextView"));
        //elementosEncontrados.get(1).click();
    }



    @Test
    public void devePreencherCampoTexto() throws MalformedURLException {


        // Como esperar elemento ser carregado para nao falhar o teste

        //WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("xxxx")));


       // dsl.escrever(MobileBy.AccessibilityId("nome"),"Zava");
        formulario.escreverNome("Zava");
        //MobileElement campoNome = driver.findElement(MobileBy.AccessibilityId("nome"));
        //campoNome.sendKeys("Zava");

        //Checar nome escrito
        //String text = campoNome.getText();
        //Assert.assertEquals("Zava",text);
        Assert.assertEquals("Zava", formulario.obterNome());
  }

  @Test
  public void deveSelecionarCombo() throws MalformedURLException {

    //Clicar no combo

    //driver.findElement(MobileBy.AccessibilityId("console")).click();

    //Selecionar opção desejada

    //driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Nintendo Switch']")).click();

      //dsl.selecionarCombo(MobileBy.AccessibilityId("console"), "Nintendo Switch");
      formulario.selecionarCombo("Nintendo Switch");

    //Verificar opção selecionada

    //String opcaoSelecionada = driver.findElement(By.xpath("//android.widget.Spinner/android.widget.TextView")).getText();
      //String text = dsl.obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
      Assert.assertEquals("Nintendo Switch", formulario.obterValorCombo());

  }

  @Test
  public void deveInteragirSwitchCheckBox() throws MalformedURLException {

    //Verificar status dos elementos

    //MobileElement check = driver.findElement(By.className("android.widget.CheckBox"));
    //MobileElement switc = driver.findElement(By.className("android.widget.Switch"));
    Assert.assertFalse(formulario.isCheckMarcado());
    Assert.assertTrue(formulario.isSwitchMarcado());
    //Assert.assertTrue(check.getAttribute("checked").equals("false"));
    //Assert.assertTrue(switc.getAttribute("checked").equals("true"));

    //Clicar nos elementos

      formulario.clicarCheck();
      formulario.clicarSwitch();
      //dsl.clicar(By.className("android.widget.CheckBox"));
      //dsl.clicar(By.className("android.widget.Switch"));
      //MobileElement check = driver.findElement(By.className("android.widget.CheckBox"));
      //MobileElement switc = driver.findElement(By.className("android.widget.Switch"));
        //check.click();
        //switc.click();

    //Verifica estados alterados

      Assert.assertTrue(formulario.isCheckMarcado());
      Assert.assertFalse(formulario.isSwitchMarcado());

  }

  @Test
    public void deveInteragirComSeekBar(){
      //acessar formulario
      menu.acessaFormulario();
      //clicar seekbar
      formulario.clicarSeekBar(0.25);

      //salvar
    formulario.Salvar();
  }


}
