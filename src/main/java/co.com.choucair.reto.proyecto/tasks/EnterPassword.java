package co.com.choucair.reto.proyecto.tasks;


import co.com.choucair.reto.proyecto.userinterface.PasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterPassword implements Task {

    public static EnterPassword onThePage() {
        return Tasks.instrumented(EnterPassword.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Entrada10*").into(PasswordPage.PASSWORD),
                Enter.theValue("Entrada10*").into(PasswordPage.SECOND_PASSWORD)
        );
        
    }
}
