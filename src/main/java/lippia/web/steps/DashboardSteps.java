package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.DashboardConstants;
import lippia.web.services.DashboardService;
import org.testng.Assert;

public class DashboardSteps extends PageSteps {

    @Then("el log in es exitoso")
    public void elLogInEsExitoso() {
        boolean isSuccessful = DashboardService.dashboardPage();
        Assert.assertTrue(isSuccessful, "El login no fue exitoso");
    }
    @And("se encuentra en la seccion Tracker")
    public void seEncuentraEnLaSeccionTracker() {
        boolean isSuccessful = DashboardService.dashboardPage();
        Assert.assertTrue(isSuccessful, "El login no fue exitoso");
    }
    @When("hace click en el icono Manual \\(m)")
    public void haceClickEnElIconoManualM() {
        DashboardService.clickIconoManual();
    }
    @And("ingresa el texto {} y el momento actual en el Campo de Texto")
    public void ingresaElTextoYElMomentoActualEnElCampoDeTexto(String texto) {
        DashboardService.setText(texto);
    }
    @And("hace click en Project")
    public void haceClickEnProject() {
        DashboardService.clickLabel();
    }
    @And("hace click en el Proyecto {}")
    public void haceClickEnElProyecto(String proyecto) {
        DashboardService.clickProject(proyecto);
    }
    @And("ingresa la hora de Inicio {}")
    public void ingresaLaHoraDeInicio(String inicio) {
        DashboardService.setHour(inicio);
    }
    @And("ingresa la hora de Finalizacion {}")
    public void ingresaLaHoraDeFinalizacion(String finalizacion) {
        DashboardService.setHourFinal(finalizacion);
    }
    @And("hace click en el boton ADD")
    public void haceClickEnElBotonADD() {
        DashboardService.clickadd();
    }
    @And("hace click en el icono Calendario")
    public void haceClickEnElIconoCalendario() {
        DashboardService.clickIconoCalendario();
    }
    @Then("se genera el registro de horas trabajadas exitosamente con el nombre del proyecto {}")
    public void seGeneraElRegistroDeHorasTrabajadasExitosamenteConElNombreDelProyecto(String texto) {
        boolean isSuccessful = DashboardService.checkTracker(texto);
        Assert.assertTrue(isSuccessful, "El registro no fue exitoso");
    }

    @When("hace click en el icono Timer \\(n)")
    public void haceClickEnElIconoTimerN() {
        DashboardService.clickIconoTimer();
    }

    @And("hace click en el boton START")
    public void haceClickEnElBotonSTART() {
        DashboardService.clickStart();
    }

    @And("hace click en el menu hamburguesa")
    public void haceClickEnElMenuHamburguesa() {
        DashboardService.clickMenu();
    }

    @And("hace click en Discard")
    public void haceClickEnDiscard() {
        DashboardService.clickLabelDiscard();
    }

    @And("hace click en el boton DISCARD")
    public void haceClickEnElBotonDISCARD() {
        DashboardService.clickButtonDiscard();
    }
    @Then("el registro se descarta exitosamente")
    public void elRegistroSeDescartaExitosamente() {
        boolean isSuccessful = DashboardService.checkStart();
        Assert.assertTrue(isSuccessful, "El registro fue exitoso");
    }

    @Given("existe un registro recientemente creado con datos seteados")
    public void existeUnRegistroRecientementeCreadoConDatosSeteados() {
        boolean isSuccessful = DashboardService.checkRegistro();
        Assert.assertTrue(isSuccessful, "El registro previo no existe");
    }

    @When("edita el texto {} y el momento actual en el Campo Add description")
    public void editaElTextoYElMomentoActualEnElCampoAddDescription(String texto) {
        DashboardService.editText(texto);
    }

    @And("click en el Project Seteado")
    public void clickEnElProjectSeteado() {
        DashboardService.clickProjectSeteado();
    }

    @And("click en el Proyecto {}")
    public void clickEnElProyecto(String proyecto) {
        DashboardService.clickEditableProject(proyecto);
    }

    @And("click en el icono Tag")
    public void clickEnElIconoTag() {
        DashboardService.clickIconoTag();
    }

    @And("click en el Tag {}")
    public void clickEnElTag(String tag) {
        DashboardService.clickTag(tag);
    }

    @And("ingresa el Tag {}")
    public void ingresaElTag(String tag) {
        DashboardService.setTag(tag);
    }

    @And("click en el icono Billable")
    public void clickEnElIconoBillable() {
        DashboardService.clickBillable();
    }

    @And("ingresar hora de Inicio {}")
    public void ingresarHoraDeInicio(String inicio) {
        DashboardService.editHour(inicio);
    }

    @And("ingresar hora de Finalizacion {}")
    public void ingresarHoraDeFinalizacion(String finalizacion) {
        DashboardService.editHourFinal(finalizacion);
    }

    @And("click en el icono Calendario")
    public void clickEnElIconoCalendario() {
        DashboardService.clickCalendario();
    }
}
