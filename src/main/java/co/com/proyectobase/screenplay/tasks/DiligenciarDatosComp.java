package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import static co.com.proyectobase.screenplay.userinterface.DatosCompraPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciarDatosComp implements Task {
    private String name;
    private String last;
    private String code;

    public  DiligenciarDatosComp(String nombre, String apellido, String codigo){
        this.name = nombre;
        this.last = apellido;
        this.code= codigo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(name).into(FIRST_NAME_BOX));
        actor.attemptsTo(Enter.theValue(last).into(LAST_NAME_BOX));
        actor.attemptsTo(Enter.theValue(code).into(POSTAL_CODE_BOX));
        actor.attemptsTo(Click.on(CONTINUE_BUTTON));
    }

    public static DiligenciarDatosComp enLaPagina(String nombre, String apellido, String codigo){
        return instrumented(DiligenciarDatosComp.class, nombre, apellido, codigo);
    }
}
