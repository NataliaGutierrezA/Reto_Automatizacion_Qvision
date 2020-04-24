package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DatosCompraPage extends PageObject {
    public static final Target FIRST_NAME_BOX = Target.the("Campo de ingreso del first name").located(By.id("first-name"));
    public static final Target LAST_NAME_BOX = Target.the("Campo de ingreso del last name").located(By.id("last-name"));
    public static final Target POSTAL_CODE_BOX = Target.the("Campo de ingreso del postal code").located(By.id("postal-code"));
    public static final Target CONTINUE_BUTTON = Target.the("boton para continuar con el pago de la compra").locatedBy("//input[@value='CONTINUE']");

}
