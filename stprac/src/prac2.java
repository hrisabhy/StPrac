import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","H:\\testing files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/ServiceLogin");
        driver.findElement(By.id("identifierId")).sendKeys("hrisabhyadav31@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        try{
            Thread.sleep(2500);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.name("password")).sendKeys("hrisabhisthebest");
        driver.findElement(By.id("passwordNext")).click();
        try{
            Thread.sleep(2500);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        String pageName= driver.getTitle();
        if (pageName.equals("Google Accont")){
            System.out.println("Login Successfull");
        }
        else {
            System.out.println("login failed");
        }
    }
}
