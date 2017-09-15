package inittime;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


import java.util.Date;

public class CurrentTime {
    private static final Logger log = LogManager.getLogger(CurrentTime.class);

    public static Date getCurrTime() {
        log.info("get current time...");
        return new Date();
    }


}