package YahooSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooSearchTest {


    private WebDriver driver;
    @BeforeTest
    public void setupDriver() {
        System.setProperty("webdriver.gecko.driver", "/Users/annrosejoshy/IdeaProjects/WebdriverJavaBootcamp/src/test/resources/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test
    public void testSearch() {
        navigatingToMainPage();
        typeRequestInSearchInput();
        submitSearch();
        //printOutAmountOfResults();

    }


    private void navigatingToMainPage() {
        String url = "http://www.yahoo.com";
        driver.get(url);
    }

    private void typeRequestInSearchInput() {

        driver.findElement(By.id("uh-search-box")).sendKeys("apple");
    }




    private void submitSearch(){
        //adding new comment
        driver.findElement(By.id("uh-search-button")).click();
        driver.quit();


    }

   /* private void printOutAmountOfResults(){
            WebElement title = driver.findElement(By.className("txt"));
            System.out.println(title.getText());
        //driver.findElement(By.linkText("apple")).click();
        driver.findElement(By.xpath("//a[text()='Apple']")).click();
        driver.quit();
         }*/

    }


