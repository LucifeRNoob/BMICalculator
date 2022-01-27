import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BMICalculatorTest {

    @Test
    public void starvationCategoryTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open BMICalculator page
        driver.get("https://healthunify.com/bmicalculator/");
        //Input the person's weight data in the 'Weight' field in kilograms
        driver.findElement(By.name("wg")).sendKeys("40");
        //Input the person's height data in the 'Weight' field in centimeters
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click the 'Calculate' button
        driver.findElement(By.name("cc")).click();
        Assert.assertEquals(driver.findElement(By.name("desc")).getAttribute("value"), "Your category is Starvation");
        driver.quit();
    }

    @Test
    public void underweightCategoryTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open BMICalculator page
        driver.get("https://healthunify.com/bmicalculator/");
        //Input the person's weight data in the 'Weight' field in kilograms
        driver.findElement(By.name("wg")).sendKeys("52");
        //Input the person's height data in the 'Weight' field in centimeters
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click the 'Calculate' button
        driver.findElement(By.name("cc")).click();
        Assert.assertEquals(driver.findElement(By.name("desc")).getAttribute("value"), "Your category is Underweight");
        driver.quit();
    }

    @Test
    public void normalCategoryTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open BMICalculator page
        driver.get("https://healthunify.com/bmicalculator/");
        //Input the person's weight data in the 'Weight' field in kilograms
        driver.findElement(By.name("wg")).sendKeys("60");
        //Input the person's height data in the 'Weight' field in centimeters
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click the 'Calculate' button
        driver.findElement(By.name("cc")).click();
        Assert.assertEquals(driver.findElement(By.name("desc")).getAttribute("value"), "Your category is Normal");
        driver.quit();
    }

    @Test
    public void overweightCategoryTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open BMICalculator page
        driver.get("https://healthunify.com/bmicalculator/");
        //Input the person's weight data in the 'Weight' field in kilograms
        driver.findElement(By.name("wg")).sendKeys("75");
        //Input the person's height data in the 'Weight' field in centimeters
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click the 'Calculate' button
        driver.findElement(By.name("cc")).click();
        Assert.assertEquals(driver.findElement(By.name("desc")).getAttribute("value"), "Your category is Overweight");
        driver.quit();
    }

    @Test
    public void obeseCategoryTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open BMICalculator page
        driver.get("https://healthunify.com/bmicalculator/");
        //Input the person's weight data in the 'Weight' field in kilograms
        driver.findElement(By.name("wg")).sendKeys("90");
        //Input the person's height data in the 'Weight' field in centimeters
        driver.findElement(By.name("ht")).sendKeys("170");
        //Click the 'Calculate' button
        driver.findElement(By.name("cc")).click();
        Assert.assertEquals(driver.findElement(By.name("desc")).getAttribute("value"), "Your category is Obese");
        driver.quit();
    }
}
