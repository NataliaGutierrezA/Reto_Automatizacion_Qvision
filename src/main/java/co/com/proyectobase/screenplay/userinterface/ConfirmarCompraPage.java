package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmarCompraPage {
    public static final Target MENSAJE_CONFIRMACION_COMPRA = Target.the("Mensaje de Confirmación De La Compra").located(By.className("complete-header"));
}
