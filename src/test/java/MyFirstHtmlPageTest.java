import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstHtmlPageTest {

    private static final String path = "file:/c:/2/BMICalculator/src/test/resources/index.html";

    @Test
    public void visitorGreetingTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open My first html page
        driver.get(path);
        //Check element header1
        Assert.assertEquals(driver.findElement(By.id("h1")).getText(), "Welcome, stranger!");
        driver.quit();
    }

    @Test
    public void bandListTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open My first html page
        driver.get(path);
        //Check element label1
        Assert.assertEquals(driver.findElement(By.id("l1")).getText(), "My favorite bands:");
        //Click on Band list
        driver.findElement(By.id("bands")).click();
        //Check element Children of Bodom
        Assert.assertEquals(driver.findElement(By.id("band1")).getText(), "Children of Bodom");
        //Check element Blind Guardian
        Assert.assertEquals(driver.findElement(By.id("band2")).getText(), "Blind Guardian");
        //Check element Scorpions
        Assert.assertEquals(driver.findElement(By.id("band3")).getText(), "Scorpions");
        //Check element Black Sabbath
        Assert.assertEquals(driver.findElement(By.id("band4")).getText(), "Black Sabbath");
        driver.quit();
    }

    @Test
    public void alertButtonTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open My first html page
        driver.get(path);
        //Check 'Click me' button
        boolean isClickMeButtonIsDisplayed = driver.findElement(By.cssSelector("#alert")).isDisplayed();
        Assert.assertTrue(isClickMeButtonIsDisplayed, "Click me isn't show");
        driver.quit();
    }

    @Test
    public void containNameTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open My first html page
        driver.get(path);
        //Is the name Andrew in the string
        Assert.assertEquals(driver.findElement(By.id("p")).getText().contains("Andrew"), true);
        driver.quit();
    }

    @Test
    public void resourceOpenedTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open My first html page
        driver.get(path);
        //Сlick on the link
        driver.findElement(By.id("hyper")).click();
        //Check that 'Onliner' has opened
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.onliner.by/");
        driver.quit();
    }

    @Test
    public void imageHasAlternativeText() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open My first html page
        driver.get(path);
        //Check text 'oops, you found it'
        Assert.assertEquals(driver.findElement(By.id("pic")).getAttribute("alt"), "oops, you found it");
        driver.close();
    }
}
