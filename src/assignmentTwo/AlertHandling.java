package assignmentTwo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.name("cusid")).sendKeys("12345");

        // Click on Submit
        driver.findElement(By.name("submit")).click();

        // Switch to the alert and accept it
        Alert firstAlert = driver.switchTo().alert();
        String firstAlertText = firstAlert.getText();
        System.out.println("First Alert Text: " + firstAlertText);
        firstAlert.accept();
	
        // Switch to the next alert and accept it
        Alert secondAlert = driver.switchTo().alert();
        String secondAlertText = secondAlert.getText();
        System.out.println("Second Alert Text: " + secondAlertText);
        secondAlert.accept();

        // Close the browser
        driver.quit();
	}

}
