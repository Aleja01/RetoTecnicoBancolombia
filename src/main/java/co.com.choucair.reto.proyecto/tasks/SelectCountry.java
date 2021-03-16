package co.com.choucair.reto.proyecto.tasks;


import co.com.choucair.reto.proyecto.userinterface.CountryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class SelectCountry implements Task {
    public static SelectCountry onThePage() {
        return Tasks.instrumented(SelectCountry.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CountryPage.COUNTRY),
                SelectFromOptions.byValue("Colombia").from(CountryPage.COUNTRY),
                Click.on(CountryPage.COUNTRY_TWO),
                Enter.theValue("Australia").into(CountryPage.ENTER_COUNTRY).thenHit(Keys.ENTER)
        );
    }
}
