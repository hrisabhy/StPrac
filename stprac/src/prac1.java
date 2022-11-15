
import org.openqa.selenium.chrome.ChromeDriver;

public class prac1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "H:\\testing files\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
    }

}
