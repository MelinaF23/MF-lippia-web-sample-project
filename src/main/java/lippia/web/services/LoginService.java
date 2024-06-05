package lippia.web.services;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;

import lippia.web.constants.LoginConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginService extends PageSteps {


    public static void clickLogInManually() {

        WebActionManager.click(LoginConstants.LOGIN_MANUALLY_BUTTON);
    }

    public static void setEmail(String email) {

        WebActionManager.setInput(LoginConstants.EMAIL_INPUT, email);
    }

    public static void setPassword(String password) {

        WebActionManager.setInput(LoginConstants.PASSWORD_INPUT, password);
    }
    public static void clickLogin() {

        WebActionManager.click(LoginConstants.LOGIN_BUTTON);
    }

    public static void clickContinue() {

        WebActionManager.click(LoginConstants.CONTINUE_BUTTON);
    }

    public static void clickGoogle() {
        WebActionManager.click(LoginConstants.GOOGLE_BUTTON);
    }
}
