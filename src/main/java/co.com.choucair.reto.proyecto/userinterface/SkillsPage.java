package co.com.choucair.reto.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SkillsPage {
    public static final Target HOBBIES = Target.the("Seleccionar Hobbies")
            .locatedBy("//input[@value='{0}']");
    public static final Target LANGUAGES = Target.the("Hacer clic en el campo 'Lenguages'")
            .located(By.id("msdd"));
    public static final Target SELECT_LANGUAGES = Target.the("Seleccionar lenguaje")
            .locatedBy("//a[@class='ui-corner-all'][contains(text(), '{0}')]");
    public static final Target SKILLS = Target.the("Seleccionar habilidad")
            .located(By.id("Skills"));


}
