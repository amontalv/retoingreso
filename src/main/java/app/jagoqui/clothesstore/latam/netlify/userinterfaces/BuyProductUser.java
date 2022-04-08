package app.jagoqui.clothesstore.latam.netlify.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BuyProductUser {

    public static final Target BTN_ITEMS = Target.the("Boton para seleccionar el tipo de item").locatedBy("//span[text()='{0}']");
    public static final Target BTN_ADD_CART = Target.the("Boton para seleccionar el producto").locatedBy("//div[contains(.,'{0}')]/following-sibling::div[@id='add-to-cart']");
    public static final Target BTN_CART = Target.the("Boton para agregar al carrito").locatedBy("//a[@id='cart']");
    public static final Target TXT_QUANTITY = Target.the("Cantidad de productos").locatedBy("//input[@class='quantity-field']");
    public static final Target TXT_SUBTOTAL = Target.the("texto subtotal").locatedBy("//div[@class ='subtotal']");
    public static final Target TXT_TOTAL = Target.the("texto total").locatedBy("//div[@id='basket-total']");

}
