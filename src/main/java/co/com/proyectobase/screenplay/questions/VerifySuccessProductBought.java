package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.proyectobase.screenplay.userinterface.ConfirmarCompraPage.MENSAJE_CONFIRMACION_COMPRA;
import static co.com.proyectobase.screenplay.util.MessagesConstants.SUCCESS_CONFIRMATION_MESSAGE;

public class VerifySuccessProductBought implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String foundedMessage = "";
        if (MENSAJE_CONFIRMACION_COMPRA.resolveFor(actor).isCurrentlyVisible()){
            foundedMessage = MENSAJE_CONFIRMACION_COMPRA.resolveFor(actor).getText();
        }
        return foundedMessage.equalsIgnoreCase(SUCCESS_CONFIRMATION_MESSAGE);
    }

    public static VerifySuccessProductBought verificacionDelMensajeEsCorrecta(){
        return new VerifySuccessProductBought();
    }
}
