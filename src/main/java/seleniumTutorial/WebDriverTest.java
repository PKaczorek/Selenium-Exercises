package seleniumTutorial;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WebDriverTest {


    @Test
    public void openGooglePage() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        ChromeOptions options = new ChromeOptions();
//        options.getBrowserName();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("window.open('https://www.google.com/', 'blank', 'height=200', 'width=200')" );
          executor.executeScript("alert('Browser says hi ')"); // displays browser pop-up(usage of JavaScript)
//        Dimension windowSize = new Dimension(1500,1500);
//        driver.manage().window().setSize(windowSize);
//        driver.quit(); // This command closes ONLY window which were open with our test
//        driver.close(); // This command closes all chrome test windows that were opened
    }
    public WebDriver getDriver(String browser) {
        switch (browser) {
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            case "ie":
                return new InternetExplorerDriver();
            default:
                throw new InvalidArgumentException("Invalid browser name");
        }
    }
}
