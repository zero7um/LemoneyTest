package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;


public class LemoneyTest {

    private LemoneyTest Lemoney;
    private Object WebDriver;

    @Test
    public void testBuscarPorUmProduto(){
        //Acessar o site e buscar pelo produto "Blouse"
        System.setProperty("webdriver.chrome.driver", "c:\\Windows\\temp\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("http://automationpractice.com/index.php");
        navegador.findElement(By.id("search_query_top")).sendKeys("Blouse");
        navegador.findElement(By.cssSelector(".btn")).click();
        navegador.findElement(By.linkText("Add to cart")).click();
        navegador.findElement(By.linkText("View my shopping cart")).click();

    }

}
