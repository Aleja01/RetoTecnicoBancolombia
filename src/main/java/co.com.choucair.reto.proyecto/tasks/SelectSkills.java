package co.com.choucair.reto.proyecto.tasks;

import co.com.choucair.reto.proyecto.userinterface.SkillsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class SelectSkills implements Task {
    public static SelectSkills onThePage() {
        return Tasks.instrumented(SelectSkills.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(SkillsPage.LANGUAGES),
                Click.on(SkillsPage.SELECT_LANGUAGES.of("Spanish")),
                Click.on(SkillsPage.HOBBIES.of("Movies")),
                SelectFromOptions.byValue("Analytics").from(SkillsPage.SKILLS)

        );
    }
}
