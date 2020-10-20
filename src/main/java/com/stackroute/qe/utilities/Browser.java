package com.stackroute.qe.utilities;

import java.util.concurrent.TimeUnit;



import com.stackroute.qe.base.TestBase;


public class Browser extends TestBase {

	
    public static String getTitle(){
        return driver.getTitle();
    }

  

    public static void goTo(String url){
        driver.get(url);
    }

    public static void close(){
        driver.close();
    }
    
    public static void timeOut(long timeoutperiod){
    	driver.manage().timeouts().implicitlyWait(timeoutperiod, TimeUnit.SECONDS);
    }
    
    public static boolean pageSourceContains(String containstext){
    	return driver.getPageSource().contains(containstext);
    }
    
}
