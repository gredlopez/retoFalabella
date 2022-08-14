package co.com.falabella.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.falabella.com.co/falabella-co")

public class PaginaPrincipalPage extends PageObject {

    public static  final Target BTN_INICIO_SESION = Target.the("click en boton inicio sesion").
            located(By.xpath("//p[@class='UserInfo-module_display1__2Gd_k UserInfo-module_label-primary__1T6Pd']"));

    public static  final Target BTN_REGISTRARSE = Target.the("click en boton registrar").
            located(By.xpath("//a[.='Regístrate']"));

    public static final Target TXT_CORREO_ELECTRONICO = Target.the("ingresar correo electronico")
            .located(By.xpath("//input[@id='testId-cc-login-form-email-input']"));

    public static final Target TXT_CONTRASENA = Target.the("ingresa contrasena")
            .located(By.xpath("//input[@id='testId-cc-login-form-password-input']"));

    public static final Target BTN_INGRESAR = Target.the("click en el boton ingresar")
            .located(By.xpath("//button[@id='testId-cc-login-form-submit']"));


}
