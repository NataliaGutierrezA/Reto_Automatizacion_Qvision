package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductosPage extends PageObject {
    public static final Target PRODUCT_BACKPACK = Target.the("producto1 agregado al carrito").located(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
    public static final Target PRODUCT_BIKE_LIGHT = Target.the("producto2 agregado al carrito").located(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button"));
    public static final Target PRODUCT_BOLT_T_SHIRT = Target.the("producto3 agregado al carrito").located(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button"));
    public static final Target CART_BUTTON = Target.the("Boton del carrito de compras").located(By.id("shopping_cart_container"));
    public static final Target PRODUCTS_LABEL = Target.the("Label productos de la página inicial").located(By.xpath("//div[text()='Products']"));

}

