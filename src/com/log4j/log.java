package com.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class log {
public static Logger Log=Logger.getLogger("log");
public static void info(String Message)
{
  PropertyConfigurator.configure("Log4j.properties");
  Log.info(Message);
  
}
}
