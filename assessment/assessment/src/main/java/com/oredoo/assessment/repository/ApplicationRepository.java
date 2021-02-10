package com.oredoo.assessment.repository;

import org.springframework.stereotype.Repository;

import com.oredoo.assessment.entity.Application;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ApplicationRepository extends JpaRepository <Application, Integer>{
	
	public Application findByApplicationId(String id);

}
