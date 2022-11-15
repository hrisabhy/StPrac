import org.openqa.selenium.chrome.ChromeDriver;

public class prac1_b {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "H:\\testing files\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        Thread.sleep(5000);
        driver.get("http://www.facebook.com");
        Thread.sleep(5000);
        driver.get("http//www.youtube.com");
    }
}
