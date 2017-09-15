package greeting;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;


public class Greeting {
    private static final Logger log  = LogManager.getLogger(Greeting.class);
    private static final String GOODMORNING = "GoodMorning";
    private static final String GOODDAY = "GoodDay";
    private static final String GOODEVENING = "GoodEvening";
    private static final String GOODNIGHT ="GoodNight";

    public String GreetingUserByLocalization(Date date, ResourceBundle resourceBundle){
        Calendar calendar = Calendar.getInstance();
        long hour = calendar.get(Calendar.HOUR_OF_DAY);
        log.info(String.format("Input date is : '%s', resourceBundle = '%s'", new SimpleDateFormat("HH:mm:ss").format(date),resourceBundle.getLocale()));
    if (hour >=0 && hour <=5){
        return resourceBundle.getString(GOODNIGHT);
    }else if (hour >=6 && hour <=8){
        return resourceBundle.getString(GOODMORNING);
    }else if (hour >9 && hour <=18){
        return resourceBundle.getString(GOODDAY);
    }else if (hour >=19 && hour <=23){
        return resourceBundle.getString(GOODEVENING);
    }else return null;
    }
}




