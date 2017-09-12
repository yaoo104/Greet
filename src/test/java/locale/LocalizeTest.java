package locale;
import org.junit.Assert;
import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LocalizeTest {
    private static final Logger log = LogManager.getLogger(LocalizeTest.class);

    @Test
    public void testGetUserLocale(){
        log.debug("Check current user locale");
        Assert.assertNotNull(Localize.getUserLocale());
        log.debug("locale not null");
    }

}