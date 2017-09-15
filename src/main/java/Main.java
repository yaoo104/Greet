import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import greeting.Greeting;
import initmessage.Messageinit;
import inittime.CurrentTime;
import locale.UserLocalization;


public class Main {
    public static void main (String[] args){
        Locale current = UserLocalization.getUserLocale();
        ResourceBundle translate = Messageinit.getCurrentUserLocaleMessage(current);
        Date date = CurrentTime.getCurrTime();
        Greeting greeting = new Greeting();

        System.out.println(greeting.GreetingUserByLocalization(date,translate));
    }
}
