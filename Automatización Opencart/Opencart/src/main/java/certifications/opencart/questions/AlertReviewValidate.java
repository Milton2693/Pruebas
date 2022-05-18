package certifications.opencart.questions;

import certifications.opencart.userinterfaces.Products;
import certifications.opencart.userinterfaces.Reviews;
import certifications.opencart.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AlertReviewValidate implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String alert = Text.of(Reviews.ALERT).viewedBy(actor).asString();
        int validate = alert.indexOf(Constant.ALERT);
        if(validate >= 0){
            return true;
        } else {
            return false;
        }
    }

    public static AlertReviewValidate alertReviewValidate(){
        return new AlertReviewValidate();
    }
}
