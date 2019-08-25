package com.POMfamework.helper.Switch;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.POMfamework.helper.logger.LoggerHelper;

public class SwitchHelper 
{
	private WebDriver driver;
private Logger log = LoggerHelper.GetLogger(SwitchHelper.class)	;
	
public void SwitchToFrame(int index)
{
	driver.switchTo().frame(index);
}


}
