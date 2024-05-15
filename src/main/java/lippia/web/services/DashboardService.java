package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import lippia.web.constants.DashboardConstants;

import java.sql.DriverManager;

public class DashboardService {
    public static boolean dashboardPage() {
        String currentUrl = PropertyManager.getProperty("web.dashboard.url");
        //String currentUrl = DriverManager.getDriverInstance().getCurrentUrl();
        return currentUrl.contains("tracker");

    }

    //public static boolean seeElement() {
    //    ActionManager.isEnabled(DashboardConstants.HOST_BUTTON);
    //}
}
