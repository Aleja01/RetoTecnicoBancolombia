package co.com.choucair.reto.proyecto.tasks;

import co.com.choucair.reto.proyecto.userinterface.BirthDatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SelectBirthDate implements Task {

    public static SelectBirthDate onThePage() {
        return Tasks.instrumented(SelectBirthDate.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SelectFromOptions.byValue("1998").from(BirthDatePage.YEAR),
                SelectFromOptions.byValue("January").from(BirthDatePage.MONTH),
                SelectFromOptions.byValue("17").from(BirthDatePage.DAY),
                Scroll.to(BirthDatePage.DAY)
        );
    }
}
