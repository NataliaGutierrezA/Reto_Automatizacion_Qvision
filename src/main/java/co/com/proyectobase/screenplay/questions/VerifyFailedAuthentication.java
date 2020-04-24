package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.proyectobase.screenplay.userinterface.ConfirmarCompraPage.MENSAJE_CONFIRMACION_COMPRA;
import static co.com.proyectobase.screenplay.userinterface.LoginPage.MENSAJE_AUTENTICACION_FALLIDA;
import static co.com.proyectobase.screenplay.util.MessagesConstants.FAILED_AUTENTICATION_MESSAGE;
import static co.com.proyectobase.screenplay.util.MessagesConstants.SUCCESS_CONFIRMATION_MESSAGE;

public class VerifyFailedAuthentication implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String foundedMessage = "";
        if (MENSAJE_AUTENTICACION_FALLIDA.resolveFor(actor).isCurrentlyVisible()){
            foundedMessage = MENSAJE_AUTENTICACION_FALLIDA.resolveFor(actor).getText();
        }
        return foundedMessage.equalsIgnoreCase(FAILED_AUTENTICATION_MESSAGE);
    }

    public static VerifyFailedAuthentication verificacionAutenticacionfallida(){
        return  new VerifyFailedAuthentication();

    }
}
