package app.jagoqui.clothesstore.latam.netlify.tasks;

import app.jagoqui.clothesstore.latam.netlify.interactions.WaitInteraction;
import app.jagoqui.clothesstore.latam.netlify.userinterfaces.BuyProductUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class BuyProductTask implements Task {

    private String item;
    private String product;

    public BuyProductTask(String item) {
        this.item = item;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BuyProductUser.BTN_ITEMS.of(item), WebElementStateMatchers.isEnabled()),
                Click.on(BuyProductUser.BTN_ITEMS.of(item)));
        actor.attemptsTo(Click.on(BuyProductUser.BTN_ADD_CART.of(product)),
                WaitInteraction.waitClass(5000));
    }

    public static BuyProductTask withItem(String item){
        return Tasks.instrumented(BuyProductTask.class,item);
    }
    public BuyProductTask withProduct(String product){
        this.product = product;
        return this;
    }
}
