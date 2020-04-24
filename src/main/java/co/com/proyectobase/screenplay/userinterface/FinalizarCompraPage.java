package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalizarCompraPage extends PageObject {
    public static final Target FINISH_BUTTON = Target.the("boton para finalizar la compra").located(By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[8]/a[2]"));
}
