package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.EnterCodeConstants;

public class EnterCodeService {
    public static void setCode(String code) {
        WebActionManager.setInput(EnterCodeConstants.CODE_BUTTON)
    }
}
