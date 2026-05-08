package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopPage {

    public WebDriver driver;

    public ShopPage(WebDriver driver){
        this.driver=driver;
    }

    public void AddtoCart(){

        driver.findElement(By.name("search")).sendKeys("Samsung Galaxy Tab");
        driver.findElement(By.className("btn-default")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement product = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.linkText("Samsung Galaxy Tab 10.1"))
        );

        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a")).click();
        driver.findElement(By.id("button-cart")).click();
    }

    public void UpdateQuantity(){

        driver.findElement(By.name("search")).sendKeys("Samsung Galaxy Tab");
        driver.findElement(By.className("btn-default")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement product = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.linkText("Samsung Galaxy Tab 10.1"))
        );

        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a")).click();
        driver.findElement(By.id("input-quantity")).click();
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("input-quantity"))
        );
        element.clear();
        element.sendKeys("2");
    }

    public void EmptyCart(){

        UpdateQuantity();
        driver.findElement(By.id("cart-total")).click();
        driver.findElement(By.className("btn-xs")).click();
    }
}
