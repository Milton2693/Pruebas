package certifications.opencart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target CATALOG = Target.the("Opcion catalogo").
            locatedBy("//a[@href=\"#collapse1\"]");
    public static final Target PRODUCTS = Target.the("Opcion productos dentro del catalogo").
            locatedBy("//a[contains(text(),'Products')]");
    public static final Target SALES = Target.the("Opcion ventas").
            locatedBy("//body/div[@id='container']/nav[@id='column-left']/ul[@id='menu']/li[@id='menu-sale']/a[1]");
    public static final Target ORDERS = Target.the("Opcion pedidos dentro de la opcion ventas").
            locatedBy("//a[contains(text(),'Orders')]");
    public static final Target REVIEWS = Target.the("Opcion reseñas dentro del catalogo").
            locatedBy("//a[contains(text(),'Reviews')]");
}
