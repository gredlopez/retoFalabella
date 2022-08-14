package co.com.falabella.Taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.falabella.UserInterface.PaginaPrincipalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class PaginaPrincipal implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
           actor.attemptsTo(

            WaitUntil.the(BTN_INICIO_SESION, isVisible()), //espere que el elemento sea cricleable para realizar la accion osea le de click, seria como una espera
                    Click.on(BTN_INICIO_SESION),
                   Click.on(BTN_REGISTRARSE)
                   );

        }catch (Exception  e){
            e.printStackTrace();
        }
    }

    public static PaginaPrincipal informacion () { //para utilizar el metodo performan debemos utilizar una instancia dentro de ella instrumend para utilizar esa instancia de la super clase
        return instrumented(PaginaPrincipal.class); // lo que hacemos aqui es sustituir la clase padre por la hija me va a retornar lo de la clase logn
    }


}
