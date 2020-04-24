package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.proyectobase.screenplay.userinterface.ProductosPage.PRODUCTS_LABEL;
import static co.com.proyectobase.screenplay.util.MessagesConstants.SUCCESS_AUTENTICATION_MESSAGE;

public class VerifySuccessAuthentication implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        String foundMessage="";
        if (PRODUCTS_LABEL.resolveFor(actor).isCurrentlyVisible()){
            foundMessage=PRODUCTS_LABEL.resolveFor(actor).getText();
        }
        return foundMessage.equalsIgnoreCase(SUCCESS_AUTENTICATION_MESSAGE);
    }

    public static VerifySuccessAuthentication verificacionAutenticacionExitosa(){
        return  new VerifySuccessAuthentication();

    }
}
