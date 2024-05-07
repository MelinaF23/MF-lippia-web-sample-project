package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {

    //LoginService loginService = new LoginService();
    @And("hace click en Log in manually")
    public void haceClickEnLogInManually() {
        LoginService.click();
    }
}