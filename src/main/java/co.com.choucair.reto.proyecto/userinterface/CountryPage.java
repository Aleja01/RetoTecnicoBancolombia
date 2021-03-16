package co.com.choucair.reto.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CountryPage {

    public static final Target COUNTRY = Target.the("Seleccionar país")
            .located(By.id("countries"));
    public static final Target COUNTRY_TWO = Target.the("Desplegar lista de países")
            .located(By.xpath("//span[contains(@aria-labelledby,'select2-country-container')]"));
    public static final Target ENTER_COUNTRY = Target.the("Ingresar país")
            .located(By.xpath("//input[contains(@class,'select2-search__field')]"));
}
