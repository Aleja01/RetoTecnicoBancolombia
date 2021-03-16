package co.com.choucair.reto.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalDataPage {

    public static final Target FIRST_NAME = Target.the("Ingresar el primer nombre")
            .located(By.xpath("//input[contains(@placeholder,'First Name')]"));
    public static final Target LAST_NAME = Target.the("Ingresar el apellido")
            .located(By.xpath("//input[contains(@placeholder,'Last Name')]"));
    public static final Target ADDRESS = Target.the("Ingresar dirección")
            .located(By.xpath("//textarea[@ng-model='Adress']"));
    public static final Target EMAIL_ADDRESS = Target.the("Ingresar dirección de correo electrónico")
            .located(By.xpath("//input[@ng-model='EmailAdress']"));
    public static final Target PHONE = Target.the("Ingresar el número de teléfono")
            .located(By.xpath("//input[@type='tel']"));
    public static final Target GENDER = Target.the("Seleccionar género")
            .locatedBy ("//input[@value='{0}']");
}
