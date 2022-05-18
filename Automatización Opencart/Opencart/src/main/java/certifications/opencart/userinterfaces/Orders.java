package certifications.opencart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Orders {

    public static final Target CHECK_POINT = Target.the("Check point pedidos").
            locatedBy("//tbody/tr[6]/td[1]/input[1]");
    public static final Target BUTTON_INVOICE = Target.the("boton Imprimir factura").
            located(By.id("button-invoice"));
    public static final Target ID_INVOICE = Target.the("Id de la factura").
            locatedBy("//h1[contains(text(),'Invoice #16767')]");
}
