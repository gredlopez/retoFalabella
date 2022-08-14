package co.com.falabella.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.falabella.com.co/falabella-co/category/cat11020948/Munecas-y-Accesorios")

public class SeleccionarProductoPage extends PageObject {


    public static final Target BTN_MENU_CATEGORIA = Target.the("click en el menu categoria")
            .located(By.xpath("//button[@class='HamburgerBtn-module_hamburgerBtn__2UiHA']"));

    public static final Target BTN_CATEGORIA_JUGETE = Target.the("click en la categoria de jugete")
           .located(By.xpath("//*[@id=\"cross-header\"]/div[3]/div/div[2]/div/ul/li[7]"));

    public static final Target BTN_SUB_CATEGORIA_JUGETES_Y_ACCESORIOS = Target.the("click en la subcategoria jugetes y accesorios")
            .located(By.xpath("//a[@href='/falabella-co/category/cat11020948/Munecas-y-Accesorios']"));

    public static final Target BTN_PRODUCTO = Target.the("click en el producto")
            .located(By.xpath("(//div[@id='testId-searchResults-products']/div[@pod-layout='4_GRID'])[1]/div/div/div/a"));

   public static final Target BTN_AGREGAR_A_LA_BOLSA = Target.the("click al boton agregar bolsa")
           .located(By.xpath("//button[@class='jsx-2166277967 button button-primary button-primary-xtra-large']"));

   public static final Target BTN_CERRAR = Target.the("click en el boton cerrar")
           .located(By.xpath("//i[@class='jsx-1941891310 csicon-danger']"));

   public static final Target TXT_BUSCAR = Target.the("buscar")
           .located(By.xpath("//input[@class='SearchBar-module_searchBar__Input__1VvhT']"));

   public static final Target BTN_BUSCAR = Target.the("boton buscar")
           .located(By.xpath("//button[@class='SearchBar-module_searchBtnIcon__6KVum']\n"));

   public static final Target PRODUCTO_BUSCADO = Target.the("click en el producto buscado")
           .located(By.xpath("(//div[@id='testId-searchResults-products']/div[@pod-layout='4_GRID'])[1]/div/div/div/a"));

    public static final Target BOLSA_COMPRA = Target.the("click en el bolsa de compra")
            .located(By.xpath("//a[@class='jsx-3482180836 button button-primary button-medium ']"));




}
