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
    		logger.error("FAILURE");
    	}
    }
    
    private void setConstants()
    {
    	Properties prop = new Properties();
    	InputStream input = null;

    	try {

    		input = new FileInputStream("/sayanything.properties");

    		// load a properties file
    		prop.load(input);

    		// get the property value and set it.
    		SayConstants.setDatabaseType(prop.getProperty("database"));
    	} catch (IOException ex) {
    		ex.printStackTrace();
    	} finally {
    		if (input != null) {
    			try {
    				input.close();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    	}
    }
	
}
