import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class MyFirstHtmlPageTest {

    private static final String PATH = "file:/c:/2/BMICalculator/src/test/resources/index.html";
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void visitorGreetingTest() {
        //Open My first html page
        driver.get(PATH);
        //Check element header1
        Assert.assertEquals(driver.findElement(By.id("h1")).getText(), "Welcome, stranger!");
    }

    @Test
    public void bandListTest() {
        //Open My first html page
        driver.get(PATH);
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
    }

    @Test
    public void alertButtonTest() {
        //Open My first html page
        driver.get(PATH);
        //Check 'Click me' button
        boolean isClickMeButtonIsDisplayed = driver.findElement(By.cssSelector("#alert")).isDisplayed();
        Assert.assertTrue(isClickMeButtonIsDisplayed, "Click me isn't show");
    }

    @Test
    public void containNameTest() {
        //Open My first html page
        driver.get(PATH);
        //Is the name Andrew in the string
        Assert.assertTrue(driver.findElement(By.id("p")).getText().contains("Andrew"));
    }

    @Test
    public void resourceOpenedTest() {
        //Open My first html page
        driver.get(PATH);
        //Сlick on the link
        driver.findElement(By.id("hyper")).click();
        //Check that 'Onliner' has opened
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.onliner.by/");
    }

    @Test
    public void imageHasAlternativeText() {
        //Open My first html page
        driver.get(PATH);
        //Check text 'oops, you found it'
        Assert.assertEquals(driver.findElement(By.id("pic")).getAttribute("alt"), "oops, you found it");
    }

    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }
}
