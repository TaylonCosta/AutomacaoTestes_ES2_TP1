package entities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

    public String driverPath;
    public String url;
    public WebDriver driver;


    @BeforeClass
    public void preCond(){
        driverPath = "C:\\Users\\Taylon\\Documents\\firefox\\geckodriver.exe"; //variavel que armazena o caminho do driver
        url = System.getProperty("user.dir")+"\\src\\paginas\\componentes.html"; //varivel que armazena o diretório da aplicação
        System.setProperty("webdriver.gecko.driver", driverPath);//instancia do driver
        driver = new FirefoxDriver(); //instancia do navegador
        driver.get(url);// abre o navegador na url especificada
        driver.manage().window().maximize();    //maximiza a tela
    }




    @AfterClass
    public void posCond(){
      //driver.quit();
    }

    protected WebDriver getDriver() {
        return driver;
    }


}
