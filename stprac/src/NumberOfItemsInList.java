import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class NumberOfItemsInList {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "H:\\testing files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/reg/");
        Thread.sleep(2000);
        Select se = new Select(driver.findElement(By.xpath("//Select[@id='day']")));
        Select se2=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
        Select se3=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
        List mylist=se.getOptions();
        List mylist2=se2.getOptions();
        List mylist3=se3.getOptions();

        System.out.println("Number of options in day dropdown: "+mylist.size());
        System.out.println("Number of options in month dropdown: "+mylist2.size());
        System.out.println("Number of options in year dropdown: "+mylist3.size());
    }
}
