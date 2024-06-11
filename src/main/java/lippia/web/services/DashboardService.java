package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import io.appium.java_client.android.nativekey.PressesKey;
import lippia.web.constants.DashboardConstants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DashboardService {
    public static boolean dashboardPage() {
        WebActionManager.waitVisibility(DashboardConstants.CLOCKYFY_LOGO);
        String currentUrl = DriverManager.getDriverInstance().getCurrentUrl();
        return currentUrl.contains("tracker");
    }

    public static void clickIconoManual() {
        WebActionManager.waitVisibility(DashboardConstants.MANUAL_ICONO);
        WebActionManager.click(DashboardConstants.MANUAL_ICONO);
    }

    public static void setText(String texto) {
        WebActionManager.setInput(DashboardConstants.AUTOCOMPLETE_INPUT, texto);
    }

    public static void clickLabel() {
        WebActionManager.click(DashboardConstants.PROJECT_LABEL);
    }

    public static void clickProject(String proyecto) {
        WebActionManager.click(DashboardConstants.SELECTION_LABEL, proyecto);
    }

    public static void setHour(String inicio) {
        WebActionManager.waitVisibility(DashboardConstants.INITIAL_TIME_INPUT);
        WebActionManager.getElement(DashboardConstants.INITIAL_TIME_INPUT).sendKeys(Keys.CONTROL + "a");
        WebActionManager.getElement(DashboardConstants.INITIAL_TIME_INPUT).sendKeys(Keys.DELETE);
        WebActionManager.setInput(DashboardConstants.INITIAL_TIME_INPUT, inicio);
    }
    public static void setHourFinal(String finalizacion) {
        WebActionManager.getElement(DashboardConstants.FINAL_TIME_INPUT).sendKeys(Keys.CONTROL + "a");
        WebActionManager.getElement(DashboardConstants.FINAL_TIME_INPUT).sendKeys(Keys.DELETE);
        WebActionManager.setInput(DashboardConstants.FINAL_TIME_INPUT, finalizacion);

    }

    public static void clickIconoCalendario() {
        WebActionManager.click(DashboardConstants.CALENDAR_ICONO);
    }


    public static void clickadd() {
        WebActionManager.click(DashboardConstants.ADD_BUTTON);
    }

    public static boolean checkTracker(String texto) {
        String escapedTexto = texto.replace("'", "\\'");
        String xpathExpression = "xpath://div[@class='cl-form-control cl-fake-input' and contains(text(), \"" + escapedTexto + "\")]";
        String generateProject = WebActionManager.getText(xpathExpression);
        if (generateProject == null) {
            return false;
        }

        return generateProject.contains(texto);
    }

    public static void clickIconoTimer() {
        WebActionManager.waitVisibility(DashboardConstants.TIMER_ICONO);
        WebActionManager.click(DashboardConstants.TIMER_ICONO);
    }

    public static void clickStart() {
        WebActionManager.click(DashboardConstants.START_BUTTON);
    }

    public static void clickMenu() {
        WebActionManager.waitVisibility(DashboardConstants.MENU_ICONO);
        WebActionManager.click(DashboardConstants.MENU_ICONO);
    }

    public static void clickLabelDiscard() {
        WebActionManager.click(DashboardConstants.DISCARD_LABEL);
    }

    public static void clickButtonDiscard() {
        WebActionManager.waitVisibilities(DashboardConstants.DISCARD_BUTTON);
        ActionManager.waitClickable(DashboardConstants.DISCARD_BUTTON);
        WebActionManager.click(DashboardConstants.DISCARD_BUTTON);
    }

    public static boolean checkStart() {
        WebActionManager.waitVisibility(DashboardConstants.START_BUTTON);
        ActionManager.waitClickable(DashboardConstants.START_BUTTON);
        return true;
    }

    public static boolean checkRegistro() {
        WebActionManager.isPresent(DashboardConstants.REGISTRO_INPUT);
        return true;
    }

    public static void editText(String texto) {
        WebActionManager.getElement(DashboardConstants.ADD_DESCRIPTION_INPUT).sendKeys(Keys.CONTROL + "a");
        WebActionManager.getElement(DashboardConstants.ADD_DESCRIPTION_INPUT).sendKeys(Keys.DELETE);
        WebActionManager.setInput(DashboardConstants.ADD_DESCRIPTION_INPUT, texto);
    }

    public static void clickProjectSeteado() {
        WebActionManager.click(DashboardConstants.EDIT_PROJECT_LABEL);
    }

    public static void clickEditableProject(String proyecto) {
        WebActionManager.waitVisibility(DashboardConstants.SELECTION_LABEL, proyecto);
        WebActionManager.click(DashboardConstants.SELECTION_LABEL, proyecto);

    }

    public static void clickIconoTag() {
        WebActionManager.click(DashboardConstants.TAG_ICON);
    }

    public static void setTag(String tag) {
        WebActionManager.setInput(DashboardConstants.TAG_INPUT, tag);
    }

    public static void clickTag(String tag) {
        WebActionManager.waitVisibility(DashboardConstants.CUSTOM_TAG_LABEL, tag);
        WebActionManager.click(DashboardConstants.CUSTOM_TAG_LABEL, tag);
        pressEscape();
    }

    private static void pressEscape() {
        WebDriver driver = DriverManager.getDriverInstance();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE).perform();
    }

    public static void clickBillable() {
        WebActionManager.click(DashboardConstants.BILLABLE_ICONO);
    }

    public static void editHour(String inicio) {
        WebActionManager.waitVisibility(DashboardConstants.EDIT_INITIAL_TIME_INPUT);
        WebActionManager.getElement(DashboardConstants.EDIT_INITIAL_TIME_INPUT).sendKeys(Keys.CONTROL + "a");
        WebActionManager.getElement(DashboardConstants.EDIT_INITIAL_TIME_INPUT).sendKeys(Keys.DELETE);
        WebActionManager.setInput(DashboardConstants.EDIT_INITIAL_TIME_INPUT, inicio);
    }

    public static void editHourFinal(String finalizacion) {
        WebActionManager.waitVisibility(DashboardConstants.EDIT_FINAL_TIME_INPUT);
        WebActionManager.getElement(DashboardConstants.EDIT_FINAL_TIME_INPUT).sendKeys(Keys.CONTROL + "a");
        WebActionManager.getElement(DashboardConstants.EDIT_FINAL_TIME_INPUT).sendKeys(Keys.DELETE);
        WebActionManager.setInput(DashboardConstants.EDIT_FINAL_TIME_INPUT, finalizacion);
    }

    public static void clickCalendario() {
        WebActionManager.click(DashboardConstants.EDIT_CALENDAR_ICONO);
    }
}