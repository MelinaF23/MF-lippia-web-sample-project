package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.GoogleConstants;

public class GoogleService {
    public static void setEmail(String email) {
        WebActionManager.setInput(GoogleConstants.EMAIL_INPUT, email);
    }

    public static void clickSiguente() {
        WebActionManager.click(GoogleConstants.SIGUIENTE_BUTTON);
    }
}
