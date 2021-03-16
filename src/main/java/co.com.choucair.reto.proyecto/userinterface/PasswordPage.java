package co.com.choucair.reto.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PasswordPage {

    public static final Target PASSWORD = Target.the("Ingresar la contraseña")
            .located(By.id("firstpassword"));
    public static final Target SECOND_PASSWORD = Target.the("Ingresar la contraseña")
            .located(By.id("secondpassword"));
}
