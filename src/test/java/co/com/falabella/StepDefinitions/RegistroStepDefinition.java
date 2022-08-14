package co.com.falabella.StepDefinitions;

import co.com.falabella.Questions.ValidacionRegistro;
import co.com.falabella.Taks.PaginaPrincipal;
import co.com.falabella.Taks.Registro;
import co.com.falabella.UserInterface.PaginaPrincipalPage;
import co.com.falabella.UserInterface.RegistroPage;
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


public class RegistroStepDefinition {
    @Managed(driver ="Chrome")
    private WebDriver navegador;
    private Actor royer = Actor.named("royer");
    PaginaPrincipalPage paginaPrincipalPage = new PaginaPrincipalPage();


    @Before
    public void  configuracion(){
        royer.can(BrowseTheWeb.with(navegador));
    }

    @Dado("que el usuario se encuentre en la pagina web")
    public void queElUsuarioSeEncuentreEnLaPaginaWeb() {
       royer.wasAbleTo(Open.browserOn(paginaPrincipalPage));

    }

    @Cuando("el ingrese los datos de registro")
    public void elIngreseLosDatosDeRegistro() {
        royer.attemptsTo(PaginaPrincipal.informacion());
        royer.attemptsTo(Registro.registro());

    }

    @Entonces("el usuario visualizara su cuenta creada.")
    public void elUsuarioVisualizaraSuCuentaCreada() {
        royer.should(seeThat( "el actor puede ver ", ValidacionRegistro.validar(), Matchers.equalTo(true)));   //juan va a visualizar algo en pantalla


    }

}
