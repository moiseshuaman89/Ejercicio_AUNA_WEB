package hitoriaDeUsuario.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import util.Driver;

import java.io.IOException;

public class Ebay_steps extends Driver{


    @Given("^Ebay se encuentra abierto$")
    public void ebaySeEncuentraAbierto()throws Exception {
        Assert.assertTrue("No se está ejecutando el app", ebayPage.irPantallaEbay());
    }

    @When("^busco el articulo \"([^\"]*)\" y doy clic en el boton Buscar$")
    public void buscoElArticuloYDoyClicEnElBotonBuscar(String articulo) throws Throwable {
        ebayPage.buscarArticuloEbay(articulo);
    }

    @And("^filtro por el tipo de marca \"([^\"]*)\" del articulo$")
    public void filtroPorElTipoDeMarcaDelArticulo(String marca) throws Throwable {
        ebayPage.filtrarTipoDeMarca(marca);
    }

    @And("^elegir el tamaño \"([^\"]*)\" del articulo$")
    public void elegirElTamañoDelArticulo(String tamano) throws Throwable {
        ebayPage.elegirTamanoDelArticulo(tamano);
    }

    @And("^imprimo el resultado de la busqueda del articulo$")
    public void imprimoElResultadoDeLaBusquedaDelArticulo() throws Exception{
        ebayPage.imprimirResultadoBusqueda();
    }

    @And("^ordenamos los articulos por Precio Descendente$")
    public void ordenamosLosArticulosPorPrecioDescendente() throws Exception{
        ebayPage.ordenarPrecioDescendente();
    }

    @Then("^elejimos los \"([^\"]*)\" primeros productos con sus precios$")
    public void elejimosLosPrimerosProductosConSusPrecios(String cantProductos) throws Throwable {
        Assert.assertTrue("No se pudo encontrar los "+cantProductos+" productos", ebayPage.elegimosArticulosCant(cantProductos)); ;
    }

    @And("^ordenamos los productos por Nombre ascendente$")
    public void ordenamosLosProductosPorNombreAscendente() {
        Assert.assertTrue("No se pudo ordenar por Nombre del Producto", ebayPage.ordenarPorNombreAscendente());
    }

    @And("^ordenamos los productos por Precio descendente$")
    public void ordenamosLosProductosPorPrecioDescendente() {
        Assert.assertTrue("No se pudo ordenar por Precio del Productos", ebayPage.ordenarPorPrecioDescendente()); ;
    }
}