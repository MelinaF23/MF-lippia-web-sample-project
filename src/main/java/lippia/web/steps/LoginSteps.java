package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {

    @Given("^The client is on google page$")
    public void home() {
        HomeService.navegarWeb();
    }

    @Given("^The client isn't on google page$")
    public void isNotHome() {
        HomeService.navegarWeb();
        throw new RuntimeException("the client is not on google page");
    }

    @When("^The client search for word (.*)$")
    public void search(String criteria) {
        HomeService.enterSearchCriteria(criteria);
        HomeService.clickSearchButton();
    }

    @Then("The client verify that results are shown properly")
    public void statVerification() {
        LoginService.verifyResults();
    }

    @Given("el usuario se encuentra en la Home")
    public void elUsuarioSeEncuentraEnLaHome() {
        HomeService.navegarWeb();
    }
}
