package com.Countersign.AutomationUtils;

import org.apache.log4j.Logger;

public class LoggerUtils {

	static Logger log = Logger.getLogger(LoggerUtils.class);

	public void logMessage(String message) {

		
		log.info(message);
	}

	public void logErrorMessage(String message) {

		log.error(message);
	}

	}
