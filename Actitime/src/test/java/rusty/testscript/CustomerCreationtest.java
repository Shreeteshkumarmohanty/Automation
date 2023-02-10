package rusty.testscript;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import rusty.genericlib.BaseClass;
import rusty.genericlib.DataUtility;

public class CustomerCreationtest extends BaseClass{

	@Test(groups= {"system"})
	public void customerCreation() throws EncryptedDocumentException, IOException
	{

	    int num= cu.getRandomNum(2000);
		String acutualcustomername=du.getDataFromExcelSheet("Sheet1", 0, 0);
		acutualcustomername=acutualcustomername+num;
		//CLICK ON TASK
		driver.findElement(By.linkText("Tasks")).click();
		//CLICK ON ADD NEW
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		//CLICK ON NEW CUSTOMER
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		//CUSTOMER NAME
		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(acutualcustomername);
		//DESCRIPTION
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("wow");
		//CLICK ON CREATECUSTOMER
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
        cu.textTobePresent(driver,acutualcustomername,By.xpath("//div[@class='titleEditButtonContainer']"));
		String customername=driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']")).getText();
		System.out.println(customername);
		Assert.assertEquals(acutualcustomername,customername);
		System.out.println("Tc is pass");

}


}
