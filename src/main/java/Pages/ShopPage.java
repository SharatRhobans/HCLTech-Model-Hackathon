package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement search = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("search"))
        );
        search.clear();
        search.sendKeys("Samsung Galaxy Tab");
        driver.findElement(By.className("btn-default")).click();
        WebElement product = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.linkText("Samsung Galaxy Tab 10.1"))
        );
        product.click();
        WebElement quantity = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("input-quantity"))
        );
        quantity.clear();
        quantity.sendKeys("2");
        WebElement addToCart = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("button-cart"))
        );
        addToCart.click();
        driver.findElement(By.id("cart-total")).click();
    }

    public void EmptyCart(){

        UpdateQuantity();
        driver.findElement(By.id("cart")).click();
        driver.findElement(By.className("btn")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("btn"))
        );
    }

    public void ViewCart(){

        UpdateQuantity();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input"))
        );
    }
}
