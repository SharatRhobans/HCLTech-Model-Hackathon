package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void RegisterUser() {

        driver.findElement(By.className("dropdown")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
        driver.findElement(By.id("input-firstname")).sendKeys("Sharat Rhoban");
        driver.findElement(By.id("input-lastname")).sendKeys("S");
        driver.findElement(By.id("input-email")).sendKeys("sharat@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("1234567");
        driver.findElement(By.id("input-password")).sendKeys("Sharat@9876");
        driver.findElement(By.id("input-confirm")).sendKeys("Sharat@9876");
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
        driver.findElement(By.className("btn-primary")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("btn-primary"))
        );
    }

    public void Logging(){

        driver.findElement(By.className("dropdown")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
        driver.findElement(By.className("list-group-item")).click();
        driver.findElement(By.id("input-email")).sendKeys("sharat@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("Sharat@9876");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
    }

    public void NewRegisterUser(){

        driver.findElement(By.className("dropdown")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
        driver.findElement(By.id("input-firstname")).sendKeys("Shivam");
        driver.findElement(By.id("input-lastname")).sendKeys("S");
        driver.findElement(By.id("input-email")).sendKeys("shivam@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("9837382922");
        driver.findElement(By.id("input-password")).sendKeys("Shivam@9876");
        driver.findElement(By.id("input-confirm")).sendKeys("Shivam@9876");
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
        driver.findElement(By.className("btn-primary")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("btn-primary"))
        );
    }

    public void LogoutUser(){

        driver.findElement(By.className("dropdown")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
        driver.findElement(By.id("input-email")).sendKeys("sharat@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("Sharat@9876");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
        driver.findElement(By.className("dropdown")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }

    public void WrongUser(){

        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
        driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"))
        );
    }
}