package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DesafioCadastroPage extends BasePage {


    public DesafioCadastroPage(WebDriver driver) {
        super(driver);
    }

    //mostrar
    @FindBy(id = "elementosForm:nome")
    private WebElement nomeTextField;
    @FindBy(id = "elementosForm:sobrenome")
    private WebElement sobrenomeTextField;
    @FindBy(id = "elementosForm:cadastrar")
    private WebElement cadastrarButton;
    @FindBy(id = "elementosForm:escolaridade")
    private  Select listaEscolaridade;
    @FindBy(id = "elementosForm:esporte")
    private  Select listaEsporte;
    @FindBy(id = "elementosForm:sexo:0")
    private WebElement sexoRadioButton;
    @FindBy(id = "elementosForm:comidaFavorita:0")
    private WebElement carne;
    @FindBy(id = "elementosForm:comidaFavorita:1")
    private WebElement frango;
    @FindBy(id = "elementosForm:comidaFavorita:2")
    private WebElement pizza;
    @FindBy(id = "elementosForm:sugestoes")
    private WebElement sugestaoText;
    @FindBy(id= "descNome")
    private WebElement labelNome;
    @FindBy(id= "descSobrenome")
    private WebElement labelSobrenome;
    @FindBy(id= "descSexo")
    private WebElement labelSexo;
    @FindBy(id= "descComida")
    private WebElement labelComida;
    @FindBy(id= "descSugestoes")
    private WebElement labelSugestoes;

        public DesafioCadastroPage preencherNome(String nome) {
        nomeTextField.sendKeys(nome);
        return this;
    }
    public DesafioCadastroPage preencherSobrenome(String sobrenome) {
        sobrenomeTextField.sendKeys(sobrenome);
        return this;
    }

    public DesafioCadastroPage clicarSexo(){
        sexoRadioButton.click();
        return this;
    }


    public DesafioCadastroPage clicarComidaCarne(){
        carne.click();
        return this;
    }


    public DesafioCadastroPage clicarComidaFrango(){
        frango.click();
        return this;
    }


    public DesafioCadastroPage clicarComidaPizza(){
        pizza.click();
        return this;
    }

    public DesafioCadastroPage preencherSugestao(String sugestoes){
        sugestaoText.sendKeys(sugestoes);
        return this;
    }


    public DesafioCadastroPage listaEscolaridade(){
        listaEscolaridade.selectByVisibleText("Superior");
        return this;
    }

    public DesafioCadastroPage listaEsporte(){
        listaEsporte.selectByVisibleText("Futebol");
        return this;
    }

    public DesafioCadastroPage clicarCadastrar() {
        cadastrarButton.click();
        return this;
    }

    public String buscarLabelNome(){
        return labelNome.getText();
    }

    public String buscarLabelSobrenome(){
        return labelSobrenome.getText();
    }

    public String buscarLabelSexo(){
        return labelSexo.getText();
    }

    public String buscarLabelComida(){
        return labelComida.getText();
    }

    public String buscarLabelSugestao(){
        return labelSugestoes.getText();
    }
}
