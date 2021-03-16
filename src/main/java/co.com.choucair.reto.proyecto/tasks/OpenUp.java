package co.com.choucair.reto.proyecto.tasks;

import co.com.choucair.reto.proyecto.userinterface.AutomationTestingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenUp implements Task {
    private AutomationTestingPage automationTestingPage;

    public static OpenUp thePage() {
        return instrumented(OpenUp.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(automationTestingPage));

    }
}
