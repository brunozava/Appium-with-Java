package SrBarrigaApplicationCore;


import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class BaseTest {

    @Rule
    public TestName testname = new TestName();

    @AfterClass
    public static void finalizaClasse(){
        DriverFactory.killDriver();
    }

    @After
    public void tearDown(){
       gerarScreenShot();
       DriverFactory.getDriver().resetApp();
    }

    public void gerarScreenShot(){
        try {
            File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(imagem, new File("target/screenshots/"+testname.getMethodName()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
