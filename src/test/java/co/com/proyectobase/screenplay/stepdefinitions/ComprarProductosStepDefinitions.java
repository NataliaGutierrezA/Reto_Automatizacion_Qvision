package co.com.proyectobase.screenplay.stepdefinitions;

import static co.com.proyectobase.screenplay.exceptions.CompraProductoException.COMPRA_FALLIDA;
import static co.com.proyectobase.screenplay.questions.VerifyFailedAuthentication.verificacionAutenticacionfallida;

import co.com.proyectobase.screenplay.exceptions.CompraProductoException;
import co.com.proyectobase.screenplay.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static co.com.proyectobase.screenplay.questions.VerifySuccessProductBought.verificacionDelMensajeEsCorrecta;
import static co.com.proyectobase.screenplay.tasks.DiligenciarDatosComp.enLaPagina;
import static co.com.proyectobase.screenplay.tasks.TerminarCompra.finalizaCompra;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.proyectobase.screenplay.tasks.AutenticarseCon.enLaPlataforma;

public class ComprarProductosStepDefinitions {

    @Managed(driver="chrome")
    private WebDriver hisBrowser;
    private Actor natalia = Actor.named("Natalia");

    @Before
    public void configuracionInicial(){
        natalia.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Ella carga la informacion de la compra$")
    public void ellaCargaLaInformacionDeLaCompra() throws Exception {
        natalia.wasAbleTo(Abrir.laPaginaDeSaucedemo());
    }

    @When("^Ella realiza la compra de un producto con (.*), (.*) y (.*)$")
    public void ellaRealizaLaCompraDeUnProductoConClaudiaUribeY57(String name, String last, String code) {
        natalia.attemptsTo(SeleccionarProductos.paginaPpal());
        natalia.attemptsTo(ConfirmarCompra.revisarOrden());
        natalia.attemptsTo(enLaPagina(name, last, code));
        natalia.attemptsTo(finalizaCompra());
    }

    @Then("^Ella verifica que la compra fue realizada de manera exitosa$")
    public void ellaVerificaQueLaCompraFueRealizadaDeManeraExitosa()  {
        natalia.should(seeThat(verificacionDelMensajeEsCorrecta()).orComplainWith(CompraProductoException.class, COMPRA_FALLIDA));
    }
}

