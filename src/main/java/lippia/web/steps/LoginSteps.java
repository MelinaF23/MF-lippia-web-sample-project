package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
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

    @And("hace click en CONTINUE WITH EMAIL")
    public void haceClickEn() {
        LoginService.clickContinue();
    }

    @And("hace click en Continue with Google")
    public void haceClickEnContinueWithGoogle() {
        LoginService.clickGoogle();
    }

    @Given("el usuario ingresó a Clockify con un mail y contraseña válidos")
    public void elUsuarioIngresóAClockifyConUnMailYContraseñaVálidos(String email, String password) {
        //String email = "pruebadepruebamelina@yopmail.com";
        //String password = "123123";
        HomeService.navegarWeb();
        HomeService.clickLogin();
        LoginService.clickLogInManually();
        LoginService.setEmail(email);
        LoginService.setPassword(password);
        LoginService.clickLogin();
    }
}