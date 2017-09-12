package initmessage;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Locale;
import java.util.ResourceBundle;

public class Messageinit {
    private static final Logger log = LogManager.getLogger(Messageinit.class);

    public static ResourceBundle getCurrentUserLocaleMessage(Locale locale){
        log.info(String.format("definition language is '%s'",locale));
        return ResourceBundle.getBundle("data",locale);
    }

}
