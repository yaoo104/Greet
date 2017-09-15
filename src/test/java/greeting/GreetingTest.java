package greeting;

import org.junit.Assert;
import org.junit.Test;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;





public class GreetingTest {
    private static final Logger log = LogManager.getLogger(GreetingTest.class);
    private Greeting greeting = new Greeting();
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("data");
    private Date date= new Date();
    @Test
    public  void greetingUserByLocalization_SameValues() {
        log.debug("Test with set time(Same Values):");
        date.setHours(11);
        String res1 = greeting.GreetingUserByLocalization(date,resourceBundle);
        log.debug("time one: '%s'", new SimpleDateFormat("HH:mm:ss").format(date));
        date.setHours(11);
        String res2 = greeting.GreetingUserByLocalization(date,resourceBundle);
        log.debug("time one: '%s'", new SimpleDateFormat("HH:mm:ss").format(date));
        Assert.assertSame(res1,res2);
        log.debug("Test success!");
    }

    @Test
    public void greetingUserTest_TruthValues(){
        log.debug("Test with set time(TruthValues)");
        date.setHours(23);
        date.setMinutes(58);
        date.setSeconds(57);
        log.debug(new SimpleDateFormat("HH:mm:ss").format(date));
        Assert.assertSame(greeting.GreetingUserByLocalization(date,resourceBundle),resourceBundle.getString("GoodDay"));
        log.debug("Test success!");
    }



}