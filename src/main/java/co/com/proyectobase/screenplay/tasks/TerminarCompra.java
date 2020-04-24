package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.proyectobase.screenplay.userinterface.FinalizarCompraPage.FINISH_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TerminarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FINISH_BUTTON));
    }

    public static TerminarCompra finalizaCompra(){
        return instrumented(TerminarCompra.class);
    }
}
