package com.POMfamework.helper.wait;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.POMfamework.helper.logger.LoggerHelper;

public class WaitHelper 
{
	private Logger log = LoggerHelper.GetLogger(WaitHelper.class);
	private WebDriver driver;
	
	
	public WaitHelper(WebDriver driver)
	{
		this.driver= driver;
	}
	public void SetImplicitWait(long timeout, TimeUnit unit)
	{
		log.info("SetImplicitWait has benn set to:" +timeout);
		driver.manage().timeouts().implicitlyWait(timeout, unit);
		
	}

}
