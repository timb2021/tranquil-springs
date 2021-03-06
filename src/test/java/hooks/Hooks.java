package hooks;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.–°ucumberLogUtils;
import utils.ConfigReaderUtils;
import utils.WebDriverUtils;
import utils.–°ucumberLogUtils;

public class Hooks {

    @Before
    public void setUp(Scenario currentScenario) {
        System.out.println("=========== Setting Up ===========");
        –°ucumberLogUtils.initScenario(currentScenario);
    }

    @After
    public void tearDown() {
        System.out.println("=========== tearing down ===========");
        WebDriverUtils.closeDriver();
    }
}
