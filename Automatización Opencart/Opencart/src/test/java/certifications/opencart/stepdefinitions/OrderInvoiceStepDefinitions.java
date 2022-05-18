package certifications.opencart.stepdefinitions;

import certifications.opencart.questions.FilterValidate;
import certifications.opencart.questions.IdInvoiceValidate;
import certifications.opencart.tasks.OrderInvoice;
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

public class OrderInvoiceStepDefinitions {

    @Before
    public void preparation(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(Constant.NAME_ACTOR);
    }

    @Given("^estar en la pagina web de opencart$")
    public void estarEnLaPaginaWebDeOpencart() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constant.URL));
    }


    @When("^iniciar sesion, luego entrar en el apartado de pedidos dentro de la opcion ventas e imprimir la factura del pedido seleccionado$")
    public void iniciarSesionLuegoEntrarEnElApartadoDePedidosDentroDeLaOpcionVentasEImprimirLaFacturaDelPedidoSeleccionado() {
        OnStage.theActorInTheSpotlight().attemptsTo(OrderInvoice.orderInvoice());
    }

    @Then("^se visualiza la informacion del producto y del pedido$")
    public void seVisualizaLaInformacionDelProductoYDelPedido() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                IdInvoiceValidate.idInvoiceValidate(), Matchers.containsString(Constant.ID_INVOICE)));
    }

}
