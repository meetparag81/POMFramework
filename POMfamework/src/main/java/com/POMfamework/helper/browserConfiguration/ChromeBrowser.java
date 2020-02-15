package com.POMfamework.helper.browserConfiguration;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeBrowser 
{
	
	public ChromeOptions getChromeOptions()
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--test-type");
		option.addArguments("--disable-popup-blocking");
		DesiredCapabilities chrome = new DesiredCapabilities().chrome();
		chrome.setJavascriptEnabled(true);
		option.setCapability(ChromeOptions.CAPABILITY, option);
		if(System.getProperty("osname").contains("Linux"))
				{
			
				}
		
 		return option;
		
	}

}
