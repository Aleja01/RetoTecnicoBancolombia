package co.com.choucair.reto.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SubmitRegisterPage {
    public static final Target SUBMIT = Target.the("Enviar registro")
            .located(By.id("submitbtn"));
}
