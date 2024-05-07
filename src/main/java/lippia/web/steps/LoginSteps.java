package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
import lippia.web.services.LoginService;

import static lippia.web.constants.HomeConstants.LOGIN_BUTTON;

public class LoginSteps extends PageSteps {

    @Given("el usuario se encuentra en la Home")
    public void elUsuarioSeEncuentraEnLaHome() {
        HomeService.navegarWeb();
    }

    @When("hace click en Log in")
    public void haceClickEnLogIn() {
        HomeService.clickLogin();
    }
}