package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.SauceDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    private SauceDemoPage saucepage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(saucepage));
    }

    public static Abrir laPaginaDeSaucedemo(){
       return instrumented(Abrir.class);
    }
}
