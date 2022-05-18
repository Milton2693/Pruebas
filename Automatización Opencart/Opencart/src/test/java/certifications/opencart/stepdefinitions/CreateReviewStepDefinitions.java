package certifications.opencart.stepdefinitions;

import certifications.opencart.questions.AlertReviewValidate;
import certifications.opencart.questions.FilterValidate;
import certifications.opencart.tasks.CreateReview;
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

public class CreateReviewStepDefinitions {

    @Before
    public void preparation(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(Constant.NAME_ACTOR);
    }

    @Given("^ingresar a la url de la pagina web de opencart$")
    public void ingresarALaUrlDeLaPaginaWebDeOpencart() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constant.URL));
    }

    @When("^iniciar sesion, luego entrar en el apartado de reviews dentro del catalogo y crear una nueva resena$")
    public void iniciarSesionLuegoEntrarEnElApartadoDeReviewsDentroDelCatalogoYCrearUnaNuevaResena() {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateReview.createReview());
    }

    @Then("^se visualiza una alerta la cual informa que no se tiene permiso para crear las resenas$")
    public void seVisualizaUnaAlertaLaCualInformaQueNoSeTienePermisoParaCrearLasResenas() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                AlertReviewValidate.alertReviewValidate(), Matchers.comparesEqualTo(true)));
    }
}
