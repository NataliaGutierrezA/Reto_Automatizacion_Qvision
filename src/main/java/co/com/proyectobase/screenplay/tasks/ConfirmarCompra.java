package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.proyectobase.screenplay.userinterface.RevisarCompraPage.*;

public class ConfirmarCompra implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CHECKOUT_BUTTON));
    }

    public static ConfirmarCompra revisarOrden(){
        return instrumented(ConfirmarCompra.class);
    }

}
