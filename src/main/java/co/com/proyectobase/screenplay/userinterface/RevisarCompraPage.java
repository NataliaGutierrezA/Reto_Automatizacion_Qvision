package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RevisarCompraPage extends PageObject {
    public static final Target CHECKOUT_BUTTON = Target.the("boton para confirmar la compra").located(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]"));
}
