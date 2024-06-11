package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {
    @Given("el usuario ingreso a Clockify con un mail y contrasenia validos")
    public void elUsuarioIngresoAClockifyConUnMailYContraseniaValidos() {
        String email = "pruebadepruebamelina@yopmail.com";
        String password = "123123";
        HomeService.navegarWeb();
        HomeService.clickLogin();
        LoginService.clickLogInManually();
        LoginService.setEmail(email);
        LoginService.setPassword(password);
        LoginService.clickLogin();
    }
}