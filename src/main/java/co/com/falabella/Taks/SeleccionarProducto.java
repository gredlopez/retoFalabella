package co.com.falabella.Taks;

import co.com.falabella.Utils.Datos;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static co.com.falabella.UserInterface.SeleccionarProductoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SeleccionarProducto implements Task {
    Datos datos = new Datos();
    private static final String NOMBRE_EXCEL = "DatosFalabella.xlsx";
    private static final String HOJA_EXCEL = "Buscar";


    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(

                    WaitUntil.the(BTN_PRODUCTO, isVisible()),
                    Click.on(BTN_PRODUCTO),
                    Click.on(BTN_AGREGAR_A_LA_BOLSA),
                    Click.on(BTN_CERRAR),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 0)).into(TXT_BUSCAR),
                    Click.on(BTN_BUSCAR),
                    Click.on(PRODUCTO_BUSCADO),
                    Click.on(BTN_AGREGAR_A_LA_BOLSA),
                    Click.on(BOLSA_COMPRA)


            );

       }
        catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static SeleccionarProducto producto() { //para utilizar el metodo performan debemos utilizar una instancia dentro de ella instrumend para utilizar esa instancia de la super clase
        return instrumented(SeleccionarProducto.class);
    }
}
