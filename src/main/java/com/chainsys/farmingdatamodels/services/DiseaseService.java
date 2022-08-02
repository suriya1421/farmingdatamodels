package com.chainsys.farmingdatamodels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.model.Disease;
import com.chainsys.farmingdatamodels.repository.DiseaseRepository;

@Service
public class DiseaseService {
@Autowired
DiseaseRepository diseaseRepository;
public List<Disease> getDisease(){
	List<Disease> list=diseaseRepository.findAll();
	return list;
}
public Disease save(Disease dis) {
	return diseaseRepository.save(dis);
	
}
public Disease findById(int id) {
	return diseaseRepository.findById(id);
	
}
public void deleteById(int id) {
	diseaseRepository.deleteById(id);
	
}}
