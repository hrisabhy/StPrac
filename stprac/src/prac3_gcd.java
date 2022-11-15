import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac3_gcd {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "H:\\testing files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("H:\\testing files\\prac3htmlcode.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("r1")).sendKeys("8");
        Thread.sleep(2000);
        driver.findElement(By.id("r2")).sendKeys("4");
        Thread.sleep(2000);
        driver.findElement(By.id("btn")).click();
        WebElement resultHtml= driver.findElement(By.id("gcdresult"));
        String result= resultHtml.getText();
        System.out.println(result);
    }
}
/*HTML CODE:<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>GCD CALCULATION</title>
</head>
<body>
	<div class="main">
		<div>
			Enter number1:<input type="number" id="r1"> <br> <br>
			Enter number2:<input type="number" id="r2"> <br> <br>
			<button class="btn" id="btn" type="button" onclick="getInputValue();">GetValue</button>
		</div>
		<div class="result">

			<p id="gcdresult">

			</p>
		</div>
	</div>
	<script>

    function gcd(a, b) {
    var R;
    while ((a % b) > 0)  {
        R = a % b;
        a = b;
        b = R;
    }
    return b;
    }

    function getInputValue(){
        var r1 = document.getElementById("r1").value;
        var r2 = document.getElementById("r2").value;
        console.log(r1);
        console.log(r2);
        document.getElementById("gcdresult").innerHTML=gcd(r1,r2);


    }

</script>
</body>
</html> */