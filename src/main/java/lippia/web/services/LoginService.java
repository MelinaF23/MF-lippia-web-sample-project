package lippia.web.services;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;

import lippia.web.constants.LoginConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginService extends PageSteps {


    public static void click() {
        WebActionManager.click(LoginConstants.LOGIN_MANUALLY_BUTTON);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
