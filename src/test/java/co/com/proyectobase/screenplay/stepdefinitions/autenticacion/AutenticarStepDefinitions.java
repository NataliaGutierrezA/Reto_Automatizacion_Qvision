package co.com.proyectobase.screenplay.stepdefinitions.autenticacion;

import co.com.proyectobase.screenplay.exceptions.AutenticacionExitosaException;
import co.com.proyectobase.screenplay.exceptions.AutenticacionFallidaException;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.AutenticarseCon;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.proyectobase.screenplay.exceptions.AutenticacionExitosaException.AUTENTICACION_EXITOSA;
import static co.com.proyectobase.screenplay.exceptions.AutenticacionFallidaException.AUTENTICACION_FALLIDA;
import static co.com.proyectobase.screenplay.questions.VerifyFailedAuthentication.verificacionAutenticacionfallida;
import static co.com.proyectobase.screenplay.questions.VerifySuccessAuthentication.verificacionAutenticacionExitosa;
import static co.com.proyectobase.screenplay.tasks.AutenticarseCon.enLaPlataforma;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AutenticarStepDefinitions {
    @Managed(driver="chrome")
    private WebDriver hisBrowser;
    private Actor natalia = Actor.named("Natalia");

    @Before
    public void configuracionInicial(){
        natalia.can(BrowseTheWeb.with(hisBrowser));
    }

    @When("^Ella realiza la autenticacion en la plataforma$")
    public void ellaRealizaLaAutenticacionEnLaPlataforma()  {
        natalia.attemptsTo(Abrir.laPaginaDeSaucedemo());
    }

    @When("^Ella realiza la autenticacion con (.*) y (.*) en la plataforma$")
    public void ellaRealizaLaAutenticacionConStandard_userYSecret_sauceEnLaPlataforma(String user, String pass)  {
        natalia.attemptsTo(enLaPlataforma(user, pass));
    }

    @Then("^Ella verifica la autenticacion fallida$")
    public void ellaVerificaLaAutenticacionFallida()  {
        natalia.should(seeThat(verificacionAutenticacionfallida()).orComplainWith(AutenticacionFallidaException.class, AUTENTICACION_FALLIDA));
    }
    @Then("^Ella verifica la autenticacion exitosa$")
    public void ellaVerificaLaAutenticacionExitosa()  {
        natalia.should(seeThat(verificacionAutenticacionExitosa()).orComplainWith(AutenticacionExitosaException.class, AUTENTICACION_EXITOSA));

    }
}
