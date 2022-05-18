package certifications.opencart.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/order_invoice.feature",
                 glue = "certifications.opencart.stepdefinitions",
                 snippets = SnippetType.CAMELCASE)
public class OrderInvoiceRunner {
}
