package com.raghav.springLogDemo.service;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LogService {

	private static Logger logger = LoggerFactory.getLogger(LogService.class);
//	private static Logger logger = LogManager.getLogger(LogService.class);
	
	public void callService() {
		
		logger.trace("logged trace message in service");
		logger.debug("logged debug message in service");
		logger.info("logged info message in service");
		logger.warn("logged warn message in service");
		logger.error("logged error message in service");
		
	}

}
