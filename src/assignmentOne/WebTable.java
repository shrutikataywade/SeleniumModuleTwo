package assignmentOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/web-table-element.php");

        WebElement tableData = driver.findElement(By.className("dataTable"));

        List<WebElement> rows = tableData.findElements(By.tagName("tr"));

        System.out.println("Company Name From the table: ");
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));

            if (!cells.isEmpty()) {
                WebElement companyNameCell = cells.get(0);

                WebElement anchorTag = companyNameCell.findElement(By.tagName("a"));

                String companyName = anchorTag.getText().trim();
                System.out.println(companyName);
            } else {
                System.out.println("No cells found in the row.");
            }
        }

        driver.close();
    }
}
