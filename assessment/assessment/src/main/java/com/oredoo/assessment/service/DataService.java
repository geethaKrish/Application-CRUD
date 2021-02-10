package com.oredoo.assessment.service;

import com.oredoo.assessment.entity.Application;

public interface DataService {
	
	public String storeApplication(Application applicatio);
	public Application retrieveApplication(String id);

}
