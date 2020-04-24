package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {
	public static final Target USER_NAME_BOX = Target.the("Campo de ingreso del user name").located(By.id("user-name"));
	public static final Target USER_PASSWORD_BOX = Target.the("Campo de ingreso del password del usuario").located(By.id("password"));
	public static final Target LOGIN_BUTTON = Target.the("Boton de ingreso del login").locatedBy("//input[@value='LOGIN']");
	public static final Target MENSAJE_AUTENTICACION_FALLIDA = Target.the("Mensaje de autenticación fallida").locatedBy("//h3[@data-test='error']");

}
