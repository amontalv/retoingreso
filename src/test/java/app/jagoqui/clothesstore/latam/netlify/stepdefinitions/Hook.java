package app.jagoqui.clothesstore.latam.netlify.stepdefinitions;

import app.jagoqui.clothesstore.latam.netlify.utils.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class Hook {

    @Before
    public void inicializeActor() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("user");
    }

    @Given("user open the application")
    public void userOpenTheApplication() {
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url(Constants.URL_APP));
    }
}
