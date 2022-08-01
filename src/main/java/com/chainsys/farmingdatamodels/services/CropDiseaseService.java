package com.chainsys.farmingdatamodels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.model.CropDiseaseDetails;
import com.chainsys.farmingdatamodels.repository.CropDiseaseDetailsRepository;

@Service
public class CropDiseaseService {
@Autowired
CropDiseaseDetailsRepository cropdis;
public List<CropDiseaseDetails> getCropDisease(){
	List<CropDiseaseDetails> list=cropdis.findAll();
	return list;
}
public CropDiseaseDetails save(CropDiseaseDetails dis) {
	return cropdis.save(dis);
	
}
public CropDiseaseDetails findById(int id) {
	return cropdis.findById(id);
	
}
public void deleteById(int id) {
	cropdis.deleteById(id);
	
}
}
