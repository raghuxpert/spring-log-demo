package com.raghav.springLogDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raghav.springLogDemo.service.LogService;



@RestController
public class LogController {
	
	@Autowired
	private LogService service;
	
	private static Logger logger = LoggerFactory.getLogger(LogController.class);
	
	@GetMapping("/hitlog")
	public String hitLog() {

		logger.info("logged info message from controller");
		logger.warn("logged warn message from controller");
		logger.trace("logged trace message in controller");
		logger.debug("logged debug message in controller");
		logger.error("logged error message in controller");
		
		service.callService();
		
		return "hit successful";
	}
}
