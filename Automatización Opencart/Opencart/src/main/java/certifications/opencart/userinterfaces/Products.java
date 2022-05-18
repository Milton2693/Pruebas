package certifications.opencart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Products {

    public static final Target NAME = Target.the("Campo nombre en el filtro de busqueda").
            located(By.id("input-name"));
    public static final Target MODEL = Target.the("Campo modelo en el filtro de busqueda").
            located(By.id("input-model"));
    public static final Target PRICE = Target.the("Campo precio en el filtro de busqueda").
            located(By.id("input-price"));
    public static final Target QUANTITY = Target.the("Campo cantidad en el filtro de busqueda").
            located(By.id("input-quantity"));
    public static final Target STATUS = Target.the("Campo estado en el filtro de busqueda").
            located(By.id("input-status"));
    public static final Target BUTTON_FILTER = Target.the("boton filtrar").
            located(By.id("button-filter"));
    public static final Target FINAL_NAME = Target.the("nombre final de la busqueda").
            locatedBy("//td[contains(text(),'Apple Cinema 30\"')]");
}
