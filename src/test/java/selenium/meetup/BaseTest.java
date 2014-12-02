package selenium.meetup;

import io.ddavison.selenium.AutomationTest;
import io.ddavison.selenium.Browser;
import io.ddavison.selenium.Config;

/**
 * Created by ddavison on 12/2/14.
 */
@Config(
    url = "http://a2selenium.ddavison.io",
    browser = Browser.CHROME
)
public class BaseTest extends AutomationTest {
    /**
     * Get the Nth child where N is the index
     * @param parent The base CSS locator of the
     * @param which the index at which the parent appears
     * @param child the css selector of the child you are trying to locate under parent
     * @return a css selector that will select your "one-of-many"
     */
    public String getNth(String parent, int which, String child) {
        return String.format("%s:nth-child(%s) %s", parent, which, child);
    }
}
