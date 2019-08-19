package com.POMfamework.helper.logger;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper 
{
	private static boolean root= false;
	
	public static Logger GetLogger(Class cls)
			{
			if(root)
			{
			return Logger.getLogger(cls);
			}
			PropertyConfigurator.configure("C:\\Users\\parag.borawake\\workspace\\POMfamework\\src\\main\\resorces\\configfile\\log4j.properties");
			root=true;
			return Logger.getLogger(cls);	
		
			}
	public static void main(String[] args)
	{
		
		Logger log = LoggerHelper.GetLogger(LoggerHelper.class);
		log.info("test");
		
	} 

}
