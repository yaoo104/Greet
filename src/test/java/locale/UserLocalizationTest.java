package locale;
import org.junit.Assert;
import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class UserLocalizationTest {
    private static final Logger log = LogManager.getLogger(UserLocalization.class);

    @Test
    public void testGetUserLocale(){
        log.debug("Check current user locale");
        Assert.assertNotNull(UserLocalization.getUserLocale());
        log.debug("locale not null");
    }

}