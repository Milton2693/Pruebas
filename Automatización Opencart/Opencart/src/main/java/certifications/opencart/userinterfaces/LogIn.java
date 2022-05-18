package certifications.opencart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogIn {

    public static final Target BUTTON_LOGIN = Target.the("Login de la pagina web Opencart").
            locatedBy("//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]");
}
