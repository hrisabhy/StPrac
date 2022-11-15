import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NumberOfImages {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "H:\\\\testing files\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        List<WebElement> imgList=driver.findElements(By.tagName("img"));
        List<WebElement> frameList=driver.findElements(By.tagName("iFrame"));
        System.out.println("Number of images:"+imgList.size());
        System.out.println("Number of frames:"+frameList.size());
    }
}
