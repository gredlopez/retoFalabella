package co.com.falabella.Taks;

import co.com.falabella.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.falabella.UserInterface.RegistroPage.*;
import java.io.IOException;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Registro implements Task {

    Datos datos = new Datos();

    private static final String NOMBRE_EXCEL = "DatosFalabella.xlsx";
    private static final String HOJA_EXCEL = "Registro";
    private static final String GEN_FEMENINO = "Mujer";
    private static final String GEN_MASCULINO = "Hombre";

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(//el actor esta intentando enviar el usuario al localozador
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 0)).into(TXT_NOMBRE),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 1)).into(TXT_APELLIDO_PATERNO),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 2)).into(TXT_APELLIDO_MATERNO),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 3)).into(TXT_EMAIL),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 4)).into(TXT_CLAVE),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 5)).into(TXT_CONFIRMAR_CLAVE),
                    SelectFromOptions.byVisibleText(datos.leerDatosExcel(NOMBRE_EXCEL,HOJA_EXCEL , 1, 6)).from(LIST_PAIS_RESIDENCIA),
                    SelectFromOptions.byVisibleText(datos.leerDatosExcel(NOMBRE_EXCEL,HOJA_EXCEL , 1, 7)).from(LIST_TIPO_DOC),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 8)).into(TXT_DOCUMENTO_COL),
                    Click.on(seleccionarGenero(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL,1,  9))),
                    SelectFromOptions.byVisibleText(datos.leerDatosExcel(NOMBRE_EXCEL,HOJA_EXCEL , 1, 10)).from(FECHA_NACIMIENTO_DIA),
                    SelectFromOptions.byVisibleText(datos.leerDatosExcel(NOMBRE_EXCEL,HOJA_EXCEL , 1, 11)).from(FECHA_NACIMIENTO_MES),
                    SelectFromOptions.byVisibleText(datos.leerDatosExcel(NOMBRE_EXCEL,HOJA_EXCEL , 1, 12)).from(FECHA_NACIMIENTO_ANIO),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL, 1, 13)).into(TXT_CELULAR),
                    Click.on(CLICK_ACEPTAR_TERMINOS),
                    Click.on(BTN_GUARDAR)

            );

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    private Target seleccionarGenero(String gen){
        Target tar = RDO_GENERO_FEMENINO;
        if (gen.equals(GEN_FEMENINO)){
            return RDO_GENERO_FEMENINO;
        }
        if (gen.equals(GEN_MASCULINO)) {
            return RDO_GENERO_MASCULINO;
        }
        return tar;
    }



    public static Registro registro () {
        return instrumented(Registro.class);
    }

}