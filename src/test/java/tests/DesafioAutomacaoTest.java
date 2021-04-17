package tests;


import entities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DesafioCadastroPage;

//@Listeners(TM4JTestNGListener.class)
public class DesafioAutomacaoTest extends BaseTest {

    String nome ="Taylon";
    String sobrenome = "Costa";
    String sugestoes = "colocar o codigo no git";
    String escolaridade = "Superior";


    @Test
    public void deveCadastrarPessoaExemplo(){
        DesafioCadastroPage cp = new DesafioCadastroPage(getDriver());
                 cp.preencherNome(nome)
                 .preencherSobrenome(sobrenome)
                 .preencherSugestao(sugestoes)
                 .clicarSexo()
                 .clicarComidaCarne()
                 .clicarComidaFrango()
                 .clicarComidaPizza()
//                 .listaEscolaridade()
//                 .listaEsporte()
                 .clicarCadastrar();

        Assert.assertEquals(cp.buscarLabelNome(), "Nome: "+nome);
        Assert.assertEquals(cp.buscarLabelSobrenome(), "Sobrenome: "+sobrenome);
        Assert.assertEquals(cp.buscarLabelSexo(), "Sexo: Masculino");
        Assert.assertEquals(cp.buscarLabelComida(), "Comida: Carne Frango Pizza");
        Assert.assertEquals(cp.buscarLabelSugestao(), "Sugestoes: "+sugestoes);

    }





}
