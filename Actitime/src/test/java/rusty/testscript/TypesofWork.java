package rusty.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import rusty.genericlib.BaseClass;

public class TypesofWork extends BaseClass {

		@Test
		public void typesofwork() throws EncryptedDocumentException, IOException
		{
				driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button_settings')]/div[1]/div")).click();
				driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
				driver.findElement(By.xpath("//div[@class='roundedBoxTag graphicButton button ']/div")).click();
				String s=du.getDataFromExcelSheet("Sheet1", 1, 0);
				driver.findElement(By.name("name")).sendKeys(s,Keys.TAB,Keys.ENTER,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB);
			    driver.findElement(By.xpath("//td[@id='ButtonPane']//input[@type='button']")).click();
			    System.out.println(cu.AlertText(driver));
			    cu.AlertOk(driver);
		}

	

}
