package guru.qa.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {
    @Test
    @Tag("property")
    protected void systemPropertiesBrowser() {
        String browserChrome = System.getProperty("browser", "Chrome");

        System.out.println(browserChrome);
    }
}
