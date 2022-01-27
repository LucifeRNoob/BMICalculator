import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BMICalculatorTest {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open BMICalculator page
        driver.get("https://healthunify.com/bmicalculator/");
    }

    @Test
    public void starvationCategoryTest() {
        //Input the person's weight data in the 'Weight' field in kilograms
        driver.findElement(By.name("wg")).sendKeys("40");
        //Input the person's height data in the 'Weight' field in centimeters
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click the 'Calculate' button
        driver.findElement(By.name("cc")).click();
        Assert.assertEquals(driver.findElement(By.name("desc")).getAttribute("value"), "Your category is Starvation");
    }

    @Test
    public void underweightCategoryTest() {
        //Input the person's weight data in the 'Weight' field in kilograms
        driver.findElement(By.name("wg")).sendKeys("52");
        //Input the person's height data in the 'Weight' field in centimeters
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click the 'Calculate' button
        driver.findElement(By.name("cc")).click();
        Assert.assertEquals(driver.findElement(By.name("desc")).getAttribute("value"), "Your category is Underweight");
    }

    @Test
    public void normalCategoryTest() {
        //Input the person's weight data in the 'Weight' field in kilograms
        driver.findElement(By.name("wg")).sendKeys("60");
        //Input the person's height data in the 'Weight' field in centimeters
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click the 'Calculate' button
        driver.findElement(By.name("cc")).click();
        Assert.assertEquals(driver.findElement(By.name("desc")).getAttribute("value"), "Your category is Normal");
    }

    @Test
    public void overweightCategoryTest() {
        //Input the person's weight data in the 'Weight' field in kilograms
        driver.findElement(By.name("wg")).sendKeys("75");
        //Input the person's height data in the 'Weight' field in centimeters
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click the 'Calculate' button
        driver.findElement(By.name("cc")).click();
        Assert.assertEquals(driver.findElement(By.name("desc")).getAttribute("value"), "Your category is Overweight");
    }

    @Test
    public void obeseCategoryTest() {
        //Input the person's weight data in the 'Weight' field in kilograms
        driver.findElement(By.name("wg")).sendKeys("90");
        //Input the person's height data in the 'Weight' field in centimeters
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click the 'Calculate' button
        driver.findElement(By.name("cc")).click();
        Assert.assertEquals(driver.findElement(By.name("desc")).getAttribute("value"), "Your category is Obese");
    }

    @AfterMethod
    public void closeDriver (){
        driver.quit();
    }
}
