package com.chainsys.farmingdatamodels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.model.Disease;
import com.chainsys.farmingdatamodels.repository.DiseaseRepository;

@Service
public class DiseaseService {
@Autowired
DiseaseRepository diseaserepo;
public List<Disease> getDisease(){
	List<Disease> list=diseaserepo.findAll();
	return list;
}
public Disease save(Disease dis) {
	return diseaserepo.save(dis);
	
}
public Disease findById(int id) {
	return diseaserepo.findById(id);
	
}
public void deleteById(int id) {
	diseaserepo.deleteById(id);
	
}}
