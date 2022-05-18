package certifications.opencart.questions;

import certifications.opencart.userinterfaces.Orders;
import certifications.opencart.userinterfaces.Products;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;

public class IdInvoiceValidate implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        String cadena = Text.of(Orders.ID_INVOICE).viewedBy(actor).asString();
        ArrayList<Character> lista = new ArrayList<>();
        for(int i = 0; i < cadena.length(); i ++)
        {
            if(Character.isDigit(cadena.charAt(i)))
                lista.add(cadena.charAt(i));
        }
        String id = "";
        for(int j = 0; j < lista.size();j ++)
        {
            id = id + lista.get(j);
        }
        return id;
    }

    public static IdInvoiceValidate idInvoiceValidate(){
        return new IdInvoiceValidate();
    }
}
