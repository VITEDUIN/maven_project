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
            var chromeDriver = new ChromeDriver();
            
            ​ var chromeDevTools = chromeDriver.getDevTools();
            ​ /​/​Session of ChromeDevTool
            ​ chromeDevTools.createSession();
            ​
            ​ /​/​Enable Network offline
            ​ enableNetworkOffline(chromeDevTools);
            
             /​/​Enable Network Online
            ​ enableNetworkOnline(chromeDevTools);
            ​
            ​ /​/​Network Interception
            ​ interceptNetwork(chromeDevTools);
            ​
            ​ /​/​Inspect Detached network
             inspectDetached(chromeDevTools);
            
             /​/​Console Log
            ​ String message = "From ExecuteAutomation";
            ​ consoleLogs(chromeDevTools, message);
            chromeDriver.executeScript("console.log('" + message + "');");
        
        // Get the DevTools instance
    //    DevTools devTools = ((ChromeDriver) driver).getDevTools();

        // Create a DevTools session and enable the necessary protocols
     //   devTools.createSession();

        // Enable the Browser domain (which corresponds to the 'browser' protocol)
     //   devTools.send(Browser.enable());

        // Example: Open a website
     //   driver.get("https://www.google.com");
        chromeDriver.get("https:/​/​amazon.in");
        // Your test logic here...

        // Close the browser
     //   driver.quit();
    }
}
