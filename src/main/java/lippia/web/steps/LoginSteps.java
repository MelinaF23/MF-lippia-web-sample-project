package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {

    //LoginService loginService = new LoginService(); INFO DE UNA CONSULTA
    @And("hace click en Log in manually")
    public void haceClickEnLogInManually() {
        LoginService.clickLogInManually();
    }

    @And("coloca un email válido {string}")
    public void colocaUnEmailVálido(String email) {
        LoginService.setEmail(email);
    }

    @And("ingresa la contraseña válida {string}")
    public void ingresaLaContraseñaVálida(String password) {
        LoginService.setPassword(password);
    }

    @And("hace click en Log in en la pantalla de Login")
    public void haceClickEnLogInEnLaPantallaDeLogin() {
        LoginService.clickLogin();
    }

    @And("hace click en {string}")
    public void haceClickEn() {
        LoginService.clickContinue();
    }
}