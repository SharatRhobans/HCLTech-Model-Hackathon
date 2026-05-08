package Test;

import Pages.ProductPage;
import Pages.RegisterPage;
import Pages.ShopPage;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {

    WebDriver driver;
    RegisterPage customers;
    ProductPage users;
    ShopPage shop;

    @BeforeMethod
    public void RunFirst(){

        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo");
        customers = new RegisterPage(driver);
        users=new ProductPage(driver);
        shop=new ShopPage(driver);
        driver.manage().window().maximize();
    }

    @Test
    public void Register(){
        customers.RegisterUser();
    }

    @Test
    public void NewRegister(){
        customers.NewRegisterUser();
    }


    @Test
    public void Logout(){
        customers.LogoutUser();
    }

    @Test
    public void Invalid(){
        customers.WrongUser();
    }

    @Test
    public void Searching(){
        users.SearchProduct();
    }

    @Test
    public void Navigate(){
        users.TopNavigation();
    }

    @Test
    public void Details(){
        users.ProductDetails();
    }

    @Test
    public void NonExisting(){
        users.NonexistingProduct();
    }

    @Test
    public void CartAdd(){
        shop.AddtoCart();
    }

    @Test
    public void ChangeQuantity(){
        shop.UpdateQuantity();
    }

    @Test
    public void ClearCart(){
        shop.EmptyCart();
    }
    @AfterMethod
    public void RunLast(){
        driver.quit();
    }

}