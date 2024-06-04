package lippia.web.steps;

import io.cucumber.java.en.And;
import lippia.web.services.EnterCodeService;

public class EnterCodeSteps {
    @And("ingresa el verification code inválido {string}")
    public void ingresaElVerificationCodeInválido(String code) {
        EnterCodeService.setCode(code)
    }
}
