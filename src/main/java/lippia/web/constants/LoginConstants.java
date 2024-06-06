package lippia.web.constants;

public class LoginConstants {

    public static final String LOGIN_MANUALLY_BUTTON = "xpath://*[contains( text(), 'manually')]";
    public static final String EMAIL_INPUT = "xpath://*[@id='email']";
    public static final String PASSWORD_INPUT = "xpath://input[contains(@id, 'password') and not(@type='hidden')]";
    public static final String LOGIN_BUTTON = "xpath://button[contains(text(), 'Log In')]";
    public static final String CONTINUE_BUTTON = "xpath://button[contains(@class, 'btn') and contains(@class, 'btn-primary')]";
    public static final String GOOGLE_BUTTON = "xpath://span[contains(text(),'Google')]";
}
