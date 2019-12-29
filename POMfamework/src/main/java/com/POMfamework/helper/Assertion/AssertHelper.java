package com.POMfamework.helper.Assertion;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.POMfamework.helper.logger.LoggerHelper;

public class AssertHelper 
{
	
	private static  Logger log = LoggerHelper.GetLogger(AssertHelper.class);

	
	public static void VerifyText(String s1, String s2)
	{
		log.info("veriying Sting"+s1 + "with" + s2);
		Assert.assertEquals(s1, s2);
	}
	public static void VerifyTrue()
	{
		log.info("making script pass");
		Assert.assertTrue(true);
	}
	public static void VerifyTrue(String message)
	{
		Assert.assertTrue(true,message);
	}
	public static void VerifyFalse()
	{
		log.info("making script fail");
		Assert.assertFalse(false);
	}
	public static void VerifyFalse(String message)
	{
		Assert.assertTrue(false,message);
	}
	
	public static void VerifyNullObject(String s1)
	{
		log.info("Object is null");
		Assert.assertNull(s1);
	}
	
}
