package co.com.choucair.reto.proyecto.tasks;

import co.com.choucair.reto.proyecto.userinterface.SubmitRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SubmitRegister implements Task {
    public static SubmitRegister onThePage() {
        return Tasks.instrumented(SubmitRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SubmitRegisterPage.SUBMIT)
        );
    }
}
