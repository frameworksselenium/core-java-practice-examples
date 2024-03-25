import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class TaseScreen_Shot{

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver"); // Replace with the actual path to your ChromeDriver

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        // Take screenshot and store as a file format
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            // Now copy the screenshot to desired location using copyFile method
            FileUtils.copyFile(src, new File("/path/to/screenshot.png")); // Replace with your desired screenshot path
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        driver.quit();
    }
}