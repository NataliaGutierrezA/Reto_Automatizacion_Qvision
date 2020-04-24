package co.com.proyectobase.screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.proyectobase.screenplay.userinterface.NavegacionMenu.ALL_ITEMS_OPTIONS;

public class NavegarMenu implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ALL_ITEMS_OPTIONS));
    }
}
