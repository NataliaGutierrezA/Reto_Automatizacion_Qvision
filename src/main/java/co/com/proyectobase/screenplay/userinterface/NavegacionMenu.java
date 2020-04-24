package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class NavegacionMenu extends PageObject {
    public static final Target ALL_ITEMS_OPTIONS = Target.the("ALL ITEMS opcion del menu").located(By.id("inventory_sidebar_link"));
    public static final Target ABOUT_OPTION = Target.the("About opcion del menu").located(By.id("about_sidebar_link"));
    public static final Target LOGOUT_OPTION = Target.the("Logout opcion del menu").located(By.id("logout_sidebar_link"));
    public static final Target RESET_APP_STATE = Target.the("Reset app State opcion del menu").located(By.id("reset_sidebar_link"));
}
