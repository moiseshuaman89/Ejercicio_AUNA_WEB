package hitoriaDeUsuario.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;


public class EbayPage extends BasePage {
    Producto[] listaProductos;
    static class Producto {
        public String nombreProduct;
        public Double precioProduct;

        public Producto(String nombreProduct, Double precioProduct) {
            this.nombreProduct = nombreProduct;
            this.precioProduct = precioProduct;
        }
    }

    //Pagina Ebay
    public @FindBy(xpath = "//img[@alt='Logotipo de eBay']") WebElement imgLogoEbay;
    public @FindBy(xpath = "//input[@value='Buscar']") WebElement btnBuscarEbay;
    public @FindBy(xpath = "//input[@placeholder='Buscar artículos']") WebElement inputBuscarArticulo;
    //btton marca
    public @FindBy(xpath = "//div[@id='x-refine__group_1__3']//button") WebElement btnVerTodoMarcas;
    // subMenuCategoria
    public @FindBy(xpath = "//div[@class='x-overlay-aspect active']/span[text()='Marca']") WebElement subMenuCategorias;
    public @FindBy(xpath = "//div[@class='x-overlay-sub-panel__aspect-options-list']//input[@placeholder='Buscar en todas las marcas disponibles']") WebElement inputMarcaArtigulo;
    public @FindBy(xpath = "//div[@class='x-overlay-sub-panel__col']//span[@class='checkbox cbx x-refine__multi-select-checkbox ']") WebElement inputCheckArticulo;
    public @FindBy(xpath = "//div[@id='c3-footerId']//button[@aria-label='Aplicar']") WebElement btnAplicarSubMenu;
    public @FindBy(xpath = "//a[@href='https://www.ebay.com/sch/i.html?_fsrp=1&_nkw=GORRA&_sacat=0&_from=R40&Brand=adidas&rt=nc&Size=S&_dcat=52365']") WebElement inputTamanoS;
    //Main
    public @FindBy(xpath = "//div/h1[@class='srp-controls__count-heading']") WebElement textResultadoBusqueda;
    //Selector por Ordenar
    public @FindBy(xpath = "//button[@aria-label='Selector para ordenar. Mejor resultado seleccionados.']") WebElement btnSelectorOrdenar;
    public @FindBy(xpath = "//a/span[text()='Precio + Envío: más alto primero']") WebElement btnDescendente;
    //Lista de productos
    public @FindBy(xpath = "//li[@data-view='mi:1686|iid:@label']//h3") WebElement lblNombreProducto;
    public @FindBy(xpath = "//li[@data-view='mi:1686|iid:@label']//span[@class='s-item__price']") WebElement lblPrecioProducto;

    public EbayPage() throws IOException {
        super();
    }

    public boolean irPantallaEbay() {
        boolean ebayOk = false;
        getDriver().get("https://www.ebay.com/");
        if(WaitUntilWebElementIsVisible(imgLogoEbay))
            ebayOk=true;

        return ebayOk;
    }

    public void buscarArticuloEbay(String articulo) throws Exception{
        if(WaitUntilWebElementIsVisible(btnBuscarEbay)){
            sendKeysToWebElement(inputBuscarArticulo,articulo);
            waitAndClickElement(btnBuscarEbay);
        }else {
            System.out.println("No se encontro el Elemento");
        }
    }
    //categoria

    public void filtrarTipoDeMarca(String marca) throws Exception{
        waitAndClickElement(btnVerTodoMarcas);
        System.out.println("OK SUB MENU DE MARCA");
        Thread.sleep(7000);
        if(WaitUntilWebElementIsVisible(subMenuCategorias)){
            sendKeysToWebElement(inputMarcaArtigulo,marca);
            waitAndClickElement(inputCheckArticulo);
            waitAndClickElement(btnAplicarSubMenu);
        }else
            System.out.println("No se encontro el Elemento SubMenu");
    }


    public void elegirTamanoDelArticulo(String tamano) throws Exception{
        if(tamano.equals("S")){
            waitAndClickElement(inputTamanoS);
        }if(tamano.equals("M")){
            waitAndClickElement(inputTamanoS);
        }
    }
    public void imprimirResultadoBusqueda() throws Exception{
        String resultadoBusq="";
        if(WaitUntilWebElementIsVisible(textResultadoBusqueda)){
            resultadoBusq= getTextToWebElement(textResultadoBusqueda);
            System.out.println("RESULTADO DE BUSQUEDA EBAY: "+ resultadoBusq);
        }
    }

    public void ordenarPrecioDescendente() throws Exception{
        waitAndClickElement(btnSelectorOrdenar);
        waitAndClickElement(btnDescendente);
        System.out.println(" ORDEN DESCENDENTE OK");
    }

    public boolean elegimosArticulosCant(String cantProductos) throws Exception{
        listaProductos= new Producto[Integer.parseInt(cantProductos)];
        String nombreProducto="", precioProducto="";
        boolean listaOK=false;
        for(int i=0;i<Integer.parseInt(cantProductos);i++){
           String xpathTitulo= replaceLabelXpath(lblNombreProducto,String.valueOf(i+1));
           nombreProducto=getTextToByXpath(By.xpath(xpathTitulo));
            String xpathPrecio= replaceLabelXpath(lblPrecioProducto,String.valueOf(i+1));
            precioProducto=getTextToByXpath(By.xpath(xpathPrecio)).replace("S/. ","");
            System.out.println("PRODUCTO N°"+(i+1)+": "+nombreProducto+" PRECIO: "+precioProducto);
            listaProductos[i]=new Producto(nombreProducto,Double.parseDouble(precioProducto));
            if (i==(Integer.parseInt(cantProductos)-1))
                listaOK=true;
        }
        return listaOK;
    }

    public boolean imprimeArrayProducto(Producto[] array) {
        boolean imprimirOk= false;
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". NOMBRE PRODUCTO: " + array[i].nombreProduct + " -  PRECIO: " + array[i].precioProduct );
            if(i==array.length-1)
                imprimirOk=true;
        }
        return imprimirOk;
    }

    public boolean ordenarPorNombreAscendente(){
        boolean nombreAscendente= false;
        Arrays.sort(listaProductos,(o1, o2) -> o1.nombreProduct.compareTo(o2.nombreProduct));
        System.out.println("ORDENAMOS LOS PRODUCTOS: ");
        nombreAscendente= imprimeArrayProducto(listaProductos);
        return nombreAscendente;
    }

    public boolean ordenarPorPrecioDescendente(){
        boolean productoDescendente= false;
        Arrays.sort(listaProductos, Collections.reverseOrder((o1, o2) -> o1.precioProduct.compareTo(o2.precioProduct)));
        System.out.println("ORDENAMOS LOS PRODUCTOS: ");
         productoDescendente= imprimeArrayProducto(listaProductos);
        return productoDescendente;
    }


}
