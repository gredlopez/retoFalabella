package co.com.falabella.StepDefinitions;

import co.com.falabella.Questions.ValidacionBolsaDeCompra;
import co.com.falabella.Taks.SeleccionarProducto;
import co.com.falabella.UserInterface.PaginaPrincipalPage;
import co.com.falabella.UserInterface.SeleccionarProductoPage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SeleccionaProducStepDefinition {
    @Managed(driver ="Chrome")
    private WebDriver navegador;
    private Actor royer = Actor.named("royer");
    PaginaPrincipalPage paginaPrincipalPage =new PaginaPrincipalPage();
    SeleccionarProductoPage seleccionarProductoPage = new SeleccionarProductoPage();

    @Before
    public void  configuracion(){
        royer.can(BrowseTheWeb.with(navegador));
    }

    @Dado("que el usuario este logeado en la pagina")
    public void queElUsuarioEsteLogeadoEnLaPagina() {
        royer.wasAbleTo(Open.browserOn(seleccionarProductoPage));
       //royer.attemptsTo(IniciarSesion.Sesion());
    }


    @Cuando("se seleccionen los productos")
    public void seSeleccionenLosProductos() {
        royer.attemptsTo(SeleccionarProducto.producto());

    }

    @Entonces("el producto se agrara al carro de compra")
    public void elProductoSeAgraraAlCarroDeCompra() {
        royer.should(seeThat( "el actor puede ver ", ValidacionBolsaDeCompra.validarBolsa(), Matchers.equalTo(true)));   //juan va a visualizar algo en pantalla


    }


}
