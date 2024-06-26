package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomeService {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickLogin() {
        WebActionManager.click(HomeConstants.LOGIN_BUTTON);
    }
}
