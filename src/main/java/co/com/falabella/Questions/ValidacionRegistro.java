package co.com.falabella.Questions;

import co.com.falabella.UserInterface.RegistroExitosoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionRegistro implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return RegistroExitosoPage.MSM_REGISTRO_EXITOSO.resolveFor(actor).isVisible();
    }
    public static Question validar(){
        return new ValidacionRegistro();
    }

}
