package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.DashboardService;
import org.testng.Assert;

public class DashboardSteps extends PageSteps {

    @Then("el log in es exitoso")
    public void elLogInEsExitoso() {
        boolean isSuccessful = DashboardService.dashboardPage();
        Assert.assertTrue(isSuccessful, "El login no fue exitoso");
}
}