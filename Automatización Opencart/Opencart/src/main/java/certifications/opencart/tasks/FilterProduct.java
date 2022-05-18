package certifications.opencart.tasks;

import certifications.opencart.interactions.Wait;
import certifications.opencart.userinterfaces.HomePage;
import certifications.opencart.userinterfaces.LogIn;
import certifications.opencart.userinterfaces.Products;
import certifications.opencart.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FilterProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.theSeconds(3),
                Click.on(LogIn.BUTTON_LOGIN),
                Wait.theSeconds(3),
                Click.on(HomePage.CATALOG),
                Click.on(HomePage.PRODUCTS),
                Wait.theSeconds(1),
                Enter.theValue(Constant.NAME).into(Products.NAME),
                Enter.theValue(Constant.MODEL).into(Products.MODEL),
                Enter.theValue(Constant.PRICE).into(Products.PRICE),
                Enter.theValue(Constant.QUANTITY).into(Products.QUANTITY),
                Click.on(Products.STATUS),
                Enter.keyValues(Keys.ARROW_DOWN).into(Products.STATUS),
                Enter.keyValues(Keys.ENTER).into(Products.STATUS),
                Click.on(Products.BUTTON_FILTER),
                Wait.theSeconds(2)
        );
    }

    public static FilterProduct filter(){
        return instrumented(FilterProduct.class);
    }
}
