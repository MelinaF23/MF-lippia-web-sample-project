package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.DashboardConstants;

public class DashboardService {
    public static boolean dashboardPage() {
        WebActionManager.waitVisibility(DashboardConstants.CLOCKYFY_LOGO);
        String currentUrl = DriverManager.getDriverInstance().getCurrentUrl();
        return currentUrl.contains("tracker");
    }
}
