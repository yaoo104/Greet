import java.util.Locale;
import java.util.ResourceBundle;

import greeting.Greeting;
import initmessage.Messageinit;
import inittime.CurrTime;
import locale.Localize;
import java.util.Date;


public class Main {
    public static void main (String[] args){
        Locale current = Localize.getUserLocale();
        ResourceBundle translate = Messageinit.getCurrentUserLocaleMessage(current);
        Date date = CurrTime.getCurrTime();
        Greeting greeting = new Greeting();

        System.out.println(greeting.GreetingUserByLocalization(date,translate));
    }
}
