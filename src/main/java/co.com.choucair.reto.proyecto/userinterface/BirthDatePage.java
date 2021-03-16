package co.com.choucair.reto.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BirthDatePage {
    public static final Target YEAR = Target.the("Seleccionar año de nacimiento")
            .located(By.id("yearbox"));
    public static final Target MONTH = Target.the("Seleccionar mes de nacimiento")
            .located(By.xpath("//select[contains(@placeholder,'Month')]"));
    public static final Target DAY = Target.the("Seleccionar día de nacimiento")
            .located(By.id("daybox"));

}
