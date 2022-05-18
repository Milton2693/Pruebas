package certifications.opencart.tasks;

import certifications.opencart.interactions.Wait;
import certifications.opencart.userinterfaces.HomePage;
import certifications.opencart.userinterfaces.LogIn;
import certifications.opencart.userinterfaces.Orders;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OrderInvoice implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.theSeconds(3),
                Click.on(LogIn.BUTTON_LOGIN),
                Wait.theSeconds(3),
                Click.on(HomePage.SALES),
                Click.on(HomePage.ORDERS),
                Wait.theSeconds(2),
                Click.on(Orders.CHECK_POINT),
                Click.on(Orders.BUTTON_INVOICE),
                Wait.theSeconds(2)
        );
    }

    public static OrderInvoice orderInvoice(){
        return instrumented(OrderInvoice.class);
    }
}
