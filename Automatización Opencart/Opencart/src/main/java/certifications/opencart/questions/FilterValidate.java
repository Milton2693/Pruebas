package certifications.opencart.questions;

import certifications.opencart.userinterfaces.Products;
import certifications.opencart.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class FilterValidate implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(Products.FINAL_NAME).viewedBy(actor).asString();
    }

    public static FilterValidate filterValidate(){
        return new FilterValidate();
    }
}
