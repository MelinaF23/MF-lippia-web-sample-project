package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.GoogleConstants;

public class GoogleService {
    public static void setEmail(String email) {
        WebActionManager.click(GoogleConstants.EMAIL_INPUT, email);
    }
}
