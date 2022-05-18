package certifications.opencart.tasks;

import certifications.opencart.interactions.Wait;
import certifications.opencart.userinterfaces.HomePage;
import certifications.opencart.userinterfaces.LogIn;
import certifications.opencart.userinterfaces.Products;
import certifications.opencart.userinterfaces.Reviews;
import certifications.opencart.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateReview implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.theSeconds(3),
                Click.on(LogIn.BUTTON_LOGIN),
                Wait.theSeconds(3),
                Click.on(HomePage.CATALOG),
                Click.on(HomePage.REVIEWS),
                Wait.theSeconds(2),
                Click.on(Reviews.AGG_REVIEW),
                Enter.theValue(Constant.AUTHOR).into(Reviews.AUTHOR),
                Wait.theSeconds(1),
                Enter.theValue(Constant.PRODUCT).into(Reviews.PRODUCT),
                Wait.theSeconds(1),
                Enter.theValue(Constant.TEXT).into(Reviews.TEXT),
                Wait.theSeconds(1),
                Click.on(Reviews.RATING),
                Wait.theSeconds(1),
                Click.on(Reviews.DATE_BUTTON),
                Wait.theSeconds(2),
                Click.on(Reviews.DATE),
                Wait.theSeconds(2),
                Click.on(Reviews.STATUS),
                Wait.theSeconds(1),
                Enter.keyValues(Keys.ARROW_DOWN).into(Products.STATUS),
                Wait.theSeconds(1),
                Enter.keyValues(Keys.ENTER).into(Products.STATUS),
                Wait.theSeconds(1),
                Click.on(Reviews.SAVE_BUTTON),
                Wait.theSeconds(2)
        );
    }

    public static CreateReview createReview(){
        return instrumented(CreateReview.class);
    }
}
