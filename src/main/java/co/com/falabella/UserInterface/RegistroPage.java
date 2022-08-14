package co.com.falabella.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class RegistroPage {

    public static  final Target TXT_NOMBRE = Target.the("registrar nombre de usuario").
            located(By.xpath("//input[@id='user']"));

    public static final Target TXT_APELLIDO_PATERNO = Target.the("Registrar primer apellido").
            located(By.xpath("//input[@id='apellidopaterno']"));


    public static final Target TXT_APELLIDO_MATERNO = Target.the("Registrar segundo apellido").
            located(By.xpath("//input[@id='apellidomaterno']"));

    public static final Target TXT_EMAIL = Target.the("Registrar correo electronico").
            located(By.xpath("//input[@id='mail']"));

    public static final Target TXT_CLAVE = Target.the("Registrar registrar clave").
            located(By.xpath("//input[@id='clave1']"));

    public static final Target TXT_CONFIRMAR_CLAVE = Target.the("Confirmar clave").
            located(By.xpath("//input[@id='clave2']"));

    public static final Target LIST_PAIS_RESIDENCIA = Target.the("Seleccionar el pais de residencia").
            located(By.xpath("//select[@id='status']\n"));

    public static final Target LIST_TIPO_DOC = Target.the("Seleccionar tipo de documento").
            located(By.xpath("//select[@id='cedula']"));

    public static final Target TXT_DOCUMENTO_COL = Target.the("Registrar numero de documento").
            located(By.xpath("//input[@id='cedula_colombia']"));

    public static final Target TXT_DOCUMENTO_OTRO = Target.the("Registrar otro tipo de numero de documento").
            located(By.xpath("//input[@id='otherDocNumber']"));


    public static final Target RDO_GENERO_FEMENINO = Target.the("Seleccionar genero").
            located(By.xpath("//input[@value='female']\n"));

    public static final Target RDO_GENERO_MASCULINO = Target.the("Seleccionar genero").
            located(By.xpath("//input[@value='male']"));

    public static final Target FECHA_NACIMIENTO_DIA = Target.the("Seleccionar dia de nacimiento").
            located(By.xpath("//select[@id='day']"));

    public static final Target FECHA_NACIMIENTO_MES = Target.the("Seleccionar mes de naciemiento").
            located(By.xpath("//select[@id='month']"));

    public static final Target FECHA_NACIMIENTO_ANIO = Target.the("Seleccionar año de nacimiento").
            located(By.xpath("//select[@id='year']\n"));

    public static final Target TXT_CELULAR = Target.the("Registrar numero de celular").
            located(By.xpath("//input[@id='celular']\n"));

    public static final Target CLICK_ACEPTAR_TERMINOS = Target.the("Click aceptar terminos y condiciones").
            located(By.xpath("//input[@id='agreelegaleId']"));

    public static final Target BTN_GUARDAR = Target.the("Click en boton guardar").
            located(By.xpath("//a[@id='boton_Ar']"));


}
