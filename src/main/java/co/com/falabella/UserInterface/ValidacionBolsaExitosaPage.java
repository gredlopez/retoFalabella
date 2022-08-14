package co.com.falabella.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ValidacionBolsaExitosaPage {


    public static final Target MSM_BOLSA_COMPRA = Target.the("visualizacion bolsa de compra").
            located(By.xpath("//*[@id=\"fbra_checkoutDeliverySteps\"]/div/div/div[1]"));
}
