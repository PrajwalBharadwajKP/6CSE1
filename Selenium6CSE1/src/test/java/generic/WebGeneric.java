package generic;

import java.util.Random;

import org.testng.Reporter;

public class WebGeneric extends BaseTest{
	public void verifyTitle(String expectedTitle) {
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle))
			Reporter.log("title verified",true);
		else
			Reporter.log("title not verified",true);
	}
	public void verifyURL(String expectedURL) {
		String actualURL = driver.getCurrentUrl();
		if(actualURL.equals(expectedURL))
			Reporter.log("URL verified",true);
		else
			Reporter.log("URL not verified",true);
	}
	public int randomNumber() {
		Random r=new Random();
		return r.nextInt();
	}
}