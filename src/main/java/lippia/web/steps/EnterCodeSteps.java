package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.EnterCodeService;
import org.testng.Assert;

public class EnterCodeSteps {
    @And("ingresa el verification code inválido {string}")
    public void ingresaElVerificationCodeInválido(String code) {
        EnterCodeService.setCode(code);
    }

    @Then("el usuario visualiza el mensaje: {string}")
    public void elUsuarioVisualizaElMensaje(String message) {
        boolean isSuccessful = EnterCodeService.checkMessage(message);
        Assert.assertTrue(isSuccessful, "El codigo es correcto");
    }
}
