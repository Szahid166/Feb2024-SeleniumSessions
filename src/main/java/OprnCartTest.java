import org.openqa.selenium.WebDriver;

import seleniumSessions.BrowserUtil;

public class OprnCartTest {
	// String browser = "chrome";

	public static void main(String[] args) {
		String browser = "chrome";
		// call a browserUtil
		
		BrowserUtil brUtil = new BrowserUtil();
	
		// call launch browser
		brUtil.launchBrowser(browser);
		//WebDriver driver =brUtil.launchBrowser(browser);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/");
		
		String actTitle = brUtil.getPageTitle();
		System.out.println("Page title: " + actTitle);

		// validation point//checkpoint
		if (actTitle.equals("Your Store")) {
			System.out.println("title is correct");
		} else {
			System.out.println("title is not correct");
		}

		String appUrl = brUtil.getPageCurrentURL();
		System.out.println(appUrl);

		if (appUrl.contains("opencart")) {
			System.out.println("URL is correct");
		} else {
			System.out.println("URL is not correct");
		}

		brUtil.quitBrowser();

		
		
		
	}

}
