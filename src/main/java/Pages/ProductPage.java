package Pages;

import Pages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    public WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver=driver;
    }

    public void SearchProduct(){

        driver.findElement(By.name("search")).sendKeys("Samsung Galaxy Tab");
        driver.findElement(By.className("btn-default")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement product = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.linkText("Samsung Galaxy Tab 10.1"))
        );
    }

    public void TopNavigation(){

        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]/a")).click();
    }

    public void ProductDetails(){

        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a")).click();
    }

    public void NonexistingProduct(){

        driver.findElement(By.name("search")).sendKeys("iphone 17 pro max");
        driver.findElement(By.className("btn-default")).click();
    }
}
