package app.jagoqui.clothesstore.latam.netlify.questions;

import app.jagoqui.clothesstore.latam.netlify.interactions.WaitInteraction;
import app.jagoqui.clothesstore.latam.netlify.userinterfaces.BuyProductUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class BuyProductQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean respuesta = false;
        actor.attemptsTo(WaitInteraction.waitClass(5000));
        if (BuyProductUser.TXT_SUBTOTAL.resolveFor(actor).getText().replace("$","").replace(".","").trim().equals(BuyProductUser.TXT_TOTAL.resolveFor(actor).getText())){
            respuesta = true;
        }
        return respuesta;
    }

    public static BuyProductQuestion withResult() {
        return new BuyProductQuestion();
    }
}
