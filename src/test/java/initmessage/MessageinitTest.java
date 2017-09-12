package initmessage;

import org.junit.Assert;
import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ResourceBundle;
import java.util.Locale;

public class MessageinitTest {
    private static final Logger  log = LogManager.getLogger(MessageinitTest.class);

    @Test
    public void MessageinitTest_NotSameLocale(){
        log.debug("Check locale for not same");
        ResourceBundle resourceBundle = Messageinit.getCurrentUserLocaleMessage(Locale.CANADA);
        ResourceBundle resourceBundle1 = Messageinit.getCurrentUserLocaleMessage(Locale.getDefault());
        Assert.assertNotSame(resourceBundle.toString(),resourceBundle1.toString());
        log.debug("locale not same");

    }

    @Test
    public void MessageInitTest_NotNullResourceBundle(){
        log.debug("Check Resource Bundle for nullable");
        Locale locale = Locale.CANADA;
        Assert.assertNotNull(Messageinit.getCurrentUserLocaleMessage(locale));
        log.debug("ResourceBundle not null");
    }

}