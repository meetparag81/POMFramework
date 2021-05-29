package com.POMfamework.helper.browserConfiguration;

import java.nio.channels.NetworkChannel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
				option.addArguments("--hedless","window-size=1024,768","--nosandbox" );
				}
		
 		return option;
 		
	}
	public WebDriver getChromeDriver(ChromeOptions cap)
		{
		if(System.getProperty("osname").contains("Mac"))
		{
			System.setProperty("webdriver.", "value");
			return new ChromeDriver(cap);
		}
			
		return null;
			
		}

}
""