import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v133.browser.Browser;

public class AppTest {

    public static void main(String[] args) {
        // Set the system property for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); // Update path to your ChromeDriver

        // Set Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-debugging-port=9222"); // Enable DevTools via remote debugging

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver(options);

        // Get the DevTools instance
        DevTools devTools = ((ChromeDriver) driver).getDevTools();

        // Create a DevTools session and enable the necessary protocols
        devTools.createSession();

        // Enable the Browser domain (which corresponds to the 'browser' protocol)
        devTools.send(Browser.enable());

        // Example: Open a website
        driver.get("https://www.google.com");

        // Your test logic here...

        // Close the browser
        driver.quit();
    }
}
