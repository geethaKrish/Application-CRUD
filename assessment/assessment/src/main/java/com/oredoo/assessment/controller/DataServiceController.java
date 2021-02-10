package com.oredoo.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oredoo.assessment.entity.Application;
import com.oredoo.assessment.service.DataService;

@RestController
public class DataServiceController {
	
	
	 @Autowired
	 DataService dataService;

	   @RequestMapping(value = "/getApplication/{id}" ,method = RequestMethod.GET)
	   public ResponseEntity<Object> getApplication(@PathVariable("id")String id) {
	      return new ResponseEntity<>(dataService.retrieveApplication(id), HttpStatus.OK);
	   }
	   
	   @RequestMapping(value = "/storeApplication", method = RequestMethod.POST)
	   public ResponseEntity<Object>  createApplication(@RequestBody Application app) {	 
		  app.setApplicationId("app-"+System.currentTimeMillis());
	      String applicationId=dataService.storeApplication(app);
	      return new ResponseEntity<>("your application has been submitted . Referance number is : "+applicationId, HttpStatus.OK);
	   }

}
