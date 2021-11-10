import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainS {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:9000");


        WebElement inputElem1 = driver.findElement(By.id("number1-input"));
        WebElement inputElem2 = driver.findElement(By.id("number2-input"));

        inputElem1.sendKeys("8");
        inputElem2.sendKeys("9");

        WebElement btn = driver.findElement(By.id("add-btn"));

        btn.click();
        driver.switchTo().frame("add-result");

        System.out.println("Result: " + driver.findElement(By.tagName("pre")).getText());

        driver.switchTo().defaultContent();


        WebElement inputElem3 = driver.findElement(By.id("number3-input"));
        WebElement inputElem4 = driver.findElement(By.id("number4-input"));

        inputElem3.sendKeys("8");
        inputElem4.sendKeys("9");


        WebElement btn1 = driver.findElement(By.id("subtract-btn"));

        btn1.click();
        driver.switchTo().frame("subtract-result");

        System.out.println("Result: " + driver.findElement(By.tagName("pre")).getText());

        driver.switchTo().defaultContent();


        WebElement inputElem5 = driver.findElement(By.id("number5-input"));
        WebElement inputElem6 = driver.findElement(By.id("number6-input"));

        inputElem5.sendKeys("8");
        inputElem6.sendKeys("9");


        WebElement btn2 = driver.findElement(By.id("multiply-btn"));

        btn2.click();
        driver.switchTo().frame("multiply-result");

        System.out.println("Result: " + driver.findElement(By.tagName("pre")).getText());

        driver.switchTo().defaultContent();

        WebElement inputElem7 = driver.findElement(By.id("number7-input"));
        WebElement inputElem8 = driver.findElement(By.id("number8-input"));

        inputElem7.sendKeys("8");
        inputElem8.sendKeys("9");


        WebElement btn3 = driver.findElement(By.id("divide-btn"));

        btn3.click();
        driver.switchTo().frame("divide-result");

        System.out.println("Result: " + driver.findElement(By.tagName("pre")).getText());

        driver.switchTo().defaultContent();



    }
}

