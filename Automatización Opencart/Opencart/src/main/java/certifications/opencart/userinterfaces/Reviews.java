package certifications.opencart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Reviews {

    public static final Target AGG_REVIEW = Target.the("Agregar nueva reseña").
            locatedBy("//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/a[1]");
    public static final Target AUTHOR = Target.the("Autor de la reseña").
            located(By.id("input-author"));
    public static final Target PRODUCT = Target.the("Producto de la reseña").
            located(By.id("input-product"));
    public static final Target TEXT = Target.the("Texto de la reseña").
            located(By.id("input-text"));
    public static final Target RATING= Target.the("Text de la reseña").
            locatedBy("//body/div[@id='container']/div[@id='content']/div[2]/div[1]/div[2]/form[1]/div[4]/div[1]/label[4]/input[1]");
    public static final Target DATE_BUTTON = Target.the("boton agregar fecha").
            locatedBy("//body/div[@id='container']/div[@id='content']/div[2]/div[1]/div[2]/form[1]/div[5]/div[1]/div[1]/span[1]/button[1]");
    public static final Target DATE = Target.the("Seleccionar la fecha").
            locatedBy("//body[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]");
    public static final Target STATUS = Target.the("Estado de la reseña").
            located(By.id("input-status"));
    public static final Target SAVE_BUTTON = Target.the("Boton para guardar la reseña").
            locatedBy("//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/button[1]");
    public static final Target ALERT = Target.the("Alerta de permisos").
            locatedBy("//body/div[@id='container']/div[@id='content']/div[2]/div[1]");

}
