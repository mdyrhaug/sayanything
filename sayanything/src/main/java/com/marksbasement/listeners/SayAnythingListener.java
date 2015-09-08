package com.marksbasement.listeners;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.marksbasement.domain.SayConstants;

/**
 * Application Lifecycle Listener implementation class SayAnythingListener
 *
 */
public class SayAnythingListener implements ServletContextListener {
	
	Logger logger = LoggerFactory.getLogger(SayAnythingListener.class);
	

    /**
     * Default constructor. 
     */
    public SayAnythingListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	try{
    		System.out.println("INSIDE LISTENER!!!!!!!!!!!!!!!!!!!!!!!!11");
    		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
    		logger.error("******************************");
    		logger.error("** Say Anything has started **"); 	   
    		logger.error("******************************");
    		setConstants();
    	} catch (Exception e)
    	{
    		e.printStackTrace();
    		logger.error("FAILURE");
    	}
    }
    
    private void setConstants()
    {
    	try{ 
    		String resourceName = "sayanything.properties"; // could also be a constant
    		ClassLoader loader = Thread.currentThread().getContextClassLoader();
    		Properties props = new Properties();
    		InputStream resourceStream = loader.getResourceAsStream(resourceName);
    	    props.load(resourceStream);
    	    SayConstants.setDatabaseType(props.getProperty("databasetype"));
    	}
    	catch (IOException ex) {
    		ex.printStackTrace();
    	}
    }
	
}
