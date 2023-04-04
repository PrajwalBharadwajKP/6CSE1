package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.ReadExcel;
import generic.WebGeneric;
import pom.HomePage;
import pom.LoginPage;

public class ValidLogin extends BaseTest{
	@Test
	void validLogin() throws EncryptedDocumentException, IOException {
		LoginPage lp=new LoginPage(driver);
		ReadExcel excel=new ReadExcel();
		String username = excel.getData("Sheet1",0,0);
		String password = excel.getData("Sheet1",0,1);
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLoginBTN().click();
		WebGeneric wg=new WebGeneric();
		wg.verifyTitle("actiTIME - Enter Time-Track");
		HomePage hp=new HomePage(driver);
		hp.getLogout().click();
		
	}
}