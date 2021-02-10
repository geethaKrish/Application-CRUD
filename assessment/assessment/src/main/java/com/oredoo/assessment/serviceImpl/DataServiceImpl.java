package com.oredoo.assessment.serviceImpl;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oredoo.assessment.entity.Application;
import com.oredoo.assessment.repository.ApplicationRepository;
import com.oredoo.assessment.service.DataService;


@Service
public class DataServiceImpl implements DataService{
	
	@Autowired
	ApplicationRepository applicationRepository;
	

	@Override
	public String storeApplication(Application application) {		
		Application app= applicationRepository.save(application);
		return app.getApplicationId();
	}

	@Override
	public Application retrieveApplication(String id) throws EntityNotFoundException{
		 return applicationRepository.findByApplicationId(id);
	}

}
