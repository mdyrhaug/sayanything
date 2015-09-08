package com.marksbasement.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.marksbasement.listeners.SayAnythingListener;

public class SayConstants {
	
	static Logger logger = LoggerFactory.getLogger(SayAnythingListener.class);
	private static String databaseType;

	public static String getDatabaseType() {
		return databaseType;
	}

	public static void setDatabaseType(String databaseType) {
		SayConstants.databaseType = databaseType;
		logger.debug("databasetype="+databaseType);
		
	}

}
