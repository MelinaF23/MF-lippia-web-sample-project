package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import lippia.web.services.DashboardService;

public class DashboardSteps extends PageSteps {

    @Then("el log in es exitoso")
    public void elLogInEsExitoso() {
        boolean isSuccessful = DashboardService.dashboardPage();
        Assert.assertTrue("El login no fue exitoso", isSuccessful);
}

    //@And("clockify redirige al usuario a su Workspace")
    //public void clockifyRedirigeAlUsuarioASuWorkspace() {
    //    boolean isEnabled = DashboardService.seeElement();
    //    Assert.assertTrue("El botón de Workspace no está habilitado", isEnabled);
    //}
}