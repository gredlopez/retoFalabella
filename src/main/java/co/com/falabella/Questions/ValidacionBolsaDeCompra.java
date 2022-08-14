package co.com.falabella.Questions;

import co.com.falabella.UserInterface.ValidacionBolsaExitosaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionBolsaDeCompra implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return ValidacionBolsaExitosaPage.MSM_BOLSA_COMPRA.resolveFor(actor).isVisible();
    }
    public static Question validarBolsa(){
        return new ValidacionBolsaDeCompra();
    }
}
