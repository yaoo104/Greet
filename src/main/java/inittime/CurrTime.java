package inittime;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Date;

public class CurrTime {
    private static final Logger log = LogManager.getLogger(CurrTime.class);

    public static Date getCurrTime(){
        log.info("get current time...");
        return new Date();
    }
}
