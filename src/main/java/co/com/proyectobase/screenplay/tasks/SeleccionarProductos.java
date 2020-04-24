package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.proyectobase.screenplay.userinterface.ProductosPage.*;



public class SeleccionarProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PRODUCT_BACKPACK));
        actor.attemptsTo(Click.on(PRODUCT_BIKE_LIGHT));
        actor.attemptsTo(Click.on(PRODUCT_BOLT_T_SHIRT));
        actor.attemptsTo(Click.on(CART_BUTTON));
      }

    public static SeleccionarProductos paginaPpal(){
        return instrumented(SeleccionarProductos.class);

    }
}
