package hitoriaDeUsuario.locators;

import org.openqa.selenium.By;

public class GoogleLocators {

    public By iniciarSesion;
    public By imagenGoogle;

    public GoogleLocators(){
        setLocators();
    }

    public void setLocators(){
        iniciarSesion = By.id("gb_70");
        imagenGoogle = By.xpath("//img[@id='hplogo']");
    }
}
