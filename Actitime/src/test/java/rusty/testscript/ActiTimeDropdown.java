package rusty.testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import rusty.elementRepository.DropDownNaming;
import rusty.elementRepository.HomePageLocators;
import rusty.genericlib.BaseClass;
import rusty.genericlib.CommonUtility;

public class ActiTimeDropdown extends BaseClass {
	@Test
	public void DropDown() throws IOException
	{
		HomePageLocators hl=new HomePageLocators(driver);
		hl.GotoGeneralSetting();
		DropDownNaming dd=new DropDownNaming(driver);
		dd.SelectProductLine();
    
       CommonUtility cu=new CommonUtility();
       cu.getSelectByVisibleText(dd.getCustomerDropDown(),"Product Line");
	}

}
