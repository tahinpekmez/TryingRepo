package mavena.base;

import java.io.File;

import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class basetest {

    protected WebDriver driver;
    public static String baseUrl = "https://www.n11.com";
    public static Dimension browserSize = null;

	@Before
    public void setUp() throws Exception{

    	DesiredCapabilities capabilities = DesiredCapabilities.chrome();

    	ChromeDriverService service = new ChromeDriverService.Builder()
    	                            .usingDriverExecutable(new File("C:\\chromedriver.exe"))
    	                            .usingAnyFreePort()
    	                            .build();
    	
    	ChromeOptions options = new ChromeOptions();
    	options.merge(capabilities);    
    	ChromeDriver driver = new ChromeDriver(service, options);
    	
        driver.manage().window().maximize();
        browserSize = driver.manage().window().getSize();
        Thread.sleep(1000);
        driver.get(baseUrl);
    }

}