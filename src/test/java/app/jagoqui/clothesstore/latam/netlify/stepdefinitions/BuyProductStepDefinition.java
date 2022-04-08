package app.jagoqui.clothesstore.latam.netlify.stepdefinitions;

import app.jagoqui.clothesstore.latam.netlify.models.BuyProductModel;
import app.jagoqui.clothesstore.latam.netlify.questions.BuyProductQuestion;
import app.jagoqui.clothesstore.latam.netlify.tasks.BuyProductTask;
import app.jagoqui.clothesstore.latam.netlify.tasks.SelectQuatityProduct;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class BuyProductStepDefinition {


    @When("select product for buy")
    public void selectProductForBuy(DataTable dataTable) {
        List<String> data= dataTable.values();
        OnStage.theActorInTheSpotlight().attemptsTo(BuyProductTask.withItem(data.get(0)).withProduct(data.get(1)));
    }
    @When("select count product {int}")
    public void selectCountProduct(int quatity) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectQuatityProduct.withQuantity(quatity));
    }
    @Then("calculate value products")
    public void calculateValueProducts() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(BuyProductQuestion.withResult()));
    }
}
