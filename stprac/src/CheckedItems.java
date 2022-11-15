import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckedItems {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "H:\\testing files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("H:\\testing files\\prac6htmlcode.html");
        int chk=0;
        int unchk=0;
        int rchk=0;
        int runchk=0;
        List<WebElement> els=driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement el:els) {
            if(el.isSelected()) {
                chk++;
            }
            else {
                unchk++;
            }
        }
        List<WebElement> radio_button=driver.findElements(By.xpath("//input[@type='radio']"));
        for(WebElement re:radio_button) {
            if(re.isSelected()) {
                rchk++;
            }
            else {
                runchk++;
            }
        }
        System.out.println("Total checked items: "+chk);
        System.out.println("Total unchecked items: "+unchk);
        System.out.println("Total checked radio button items:"+rchk);
        System.out.println("Total unchecked radio button items:"+runchk);
    }
}
/* <html>
<body>
<form>
<h2>Select Gender</h2>
<input type="radio" name="gender" value="male"
checked> Male<br>
<input type="radio" name="gender" value="female">
Female<br>
<input type="radio" name="gender" value="other"
checked> Other<br>
<h2>Select Languages Known</h2>
<input type="checkbox" name="lang" value="Java"
checked="checked"> Java<br>
<input type="checkbox" name="lang" value="PHP"
checked="checked"> PHP<br> <input type="checkbox"
name="lang" value="C#"> C#<br>
<input type="checkbox" name="lang" value="Python"
checked="checked"> Python<br> <input
type="checkbox" name="lang" value="Ruby"> Ruby<br>
<br><br>
<input type="submit" value="Submit">
</form>
</body>
</html> */
