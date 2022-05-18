package certifications.opencart.stepdefinitions;

import certifications.opencart.questions.FilterValidate;
import certifications.opencart.tasks.FilterProduct;
import certifications.opencart.utils.Constant;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class FilterProductStepDefinitions {

    @Before
    public void preparation(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(Constant.NAME_ACTOR);
    }

    @Given("^Ingresar a la pagina web de opencart$")
    public void ingresarALaPaginaWebDeOpencart() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constant.URL));
    }


    @When("^Iniciar sesion, luego entrar en el apartado de catalog, despues en products y por ultimo hacer uso del filter$")
    public void iniciarSesionLuegoEntrarEnElApartadoDeCatalogDespuesEnProductsYPorUltimoHacerUsoDelFilter() {
        OnStage.theActorInTheSpotlight().attemptsTo(FilterProduct.filter());
    }

    @Then("^Se observa la busqueda del producto por medio del filtro$")
    public void seObservaLaBusquedaDelProductoPorMedioDelFiltro() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                FilterValidate.filterValidate(), Matchers.containsString(Constant.NAME)));
    }

}
