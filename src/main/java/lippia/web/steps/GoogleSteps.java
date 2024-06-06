package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.EnterCodeService;
import lippia.web.services.GoogleService;
import org.testng.Assert;

public class GoogleSteps {

    @And("coloca un email inválido {string}")
    public void colocaUnEmailInválido(String email) {
        GoogleService.setEmail(email);
    }

    @And("hace click en Siguiente")
    public void haceClickEnSiguiente() {
        GoogleService.clickSiguente();
    }

}
