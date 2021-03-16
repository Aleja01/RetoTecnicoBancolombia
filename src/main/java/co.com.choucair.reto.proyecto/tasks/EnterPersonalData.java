package co.com.choucair.reto.proyecto.tasks;


import co.com.choucair.reto.proyecto.userinterface.PersonalDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterPersonalData implements Task {
    public static EnterPersonalData onThePage() {
        return Tasks.instrumented(EnterPersonalData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue("Alejandra").into(PersonalDataPage.FIRST_NAME),
                Enter.theValue("Fiscal").into(PersonalDataPage.LAST_NAME),
                Enter.theValue("Calle 74 A sur").into(PersonalDataPage.ADDRESS),
                Enter.theValue("jafiscal5@gmail.com").into(PersonalDataPage.EMAIL_ADDRESS),
                Enter.theValue("3144913661").into(PersonalDataPage.PHONE),
                Click.on(PersonalDataPage.GENDER.of("Male"))
        );

    }
}
