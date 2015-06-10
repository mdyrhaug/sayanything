package com.marksbasement.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    	} catch (Exception e)
    	{
    		logger.error("FAILURE");
    	}
    }
	
}
