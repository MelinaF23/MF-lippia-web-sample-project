package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.DashboardConstants;
import lippia.web.constants.EnterCodeConstants;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EnterCodeService {
    public static void setCode(String code) {
        WebActionManager.setInput(EnterCodeConstants.CODE_BUTTON, code);
        WebActionManager.waitVisibilities(EnterCodeConstants.CODE_BUTTON);
        List<WebElement> el = WebActionManager.getElements(EnterCodeConstants.CODE_BUTTON);
        //el.stream().forEach(k -> k.sendKeys());
        for (int i = 0; i < el.size(); i++) {
            el.get(i).sendKeys(String.valueOf(code.charAt(i)));
        }
    }

    public static boolean checkMessage(String message) {
        String actualMessage = WebActionManager.getText(EnterCodeConstants.CODE_MESSAGE);
        return actualMessage.contains(message);
    }
}
