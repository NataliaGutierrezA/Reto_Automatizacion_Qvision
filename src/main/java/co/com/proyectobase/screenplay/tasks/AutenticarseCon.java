package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.proyectobase.screenplay.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AutenticarseCon implements Task {
    private String user;
    private String password;

   public  AutenticarseCon(String usuario, String pass){
        this.user = usuario;
        this.password = pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user).into(USER_NAME_BOX),
        Enter.theValue(password).into(USER_PASSWORD_BOX),
        Click.on(LOGIN_BUTTON));
    }

    public static AutenticarseCon enLaPlataforma(String usuario, String pass){
        return instrumented(AutenticarseCon.class, usuario, pass);
    }
}