package app.jagoqui.clothesstore.latam.netlify.tasks;

import app.jagoqui.clothesstore.latam.netlify.userinterfaces.BuyProductUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SelectQuatityProduct implements Task {
    private int quatity;

    public SelectQuatityProduct(int quatity) {
        this.quatity = quatity;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BuyProductUser.BTN_CART, WebElementStateMatchers.isClickable()),
                Click.on(BuyProductUser.BTN_CART),
                Enter.theValue(String.valueOf(quatity)).into(BuyProductUser.TXT_QUANTITY),
                Click.on(BuyProductUser.TXT_SUBTOTAL));
    }

    public static SelectQuatityProduct withQuantity(int quantity){
        return Tasks.instrumented(SelectQuatityProduct.class,quantity);
    }
}
