package locale;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.Locale;

public class Localize {
    private static final Logger log = LogManager.getLogger(Localize.class);
    public static Locale getUserLocale(){
        log.info("getting current user location...");
        return Locale.getDefault();
    }

}
