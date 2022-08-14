package co.com.falabella.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroExitosoPage {

    public static final Target MSM_REGISTRO_EXITOSO = Target.the("visualizacion de registro exitoso").
            located(By.xpath("//div[.='TU CUENTA YA ESTÁ CREADA']"));

}
