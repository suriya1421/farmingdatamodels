package com.chainsys.farmingdatamodels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.model.CropDiseaseDetails;
import com.chainsys.farmingdatamodels.repository.CropDiseaseDetailsRepository;

@Service
public class CropDiseaseService {
@Autowired
CropDiseaseDetailsRepository cropDiseaseDetailsRepository;
public List<CropDiseaseDetails> getCropDisease(){
	List<CropDiseaseDetails> list=cropDiseaseDetailsRepository.findAll();
	return list;
}
public CropDiseaseDetails save(CropDiseaseDetails dis) {
	return cropDiseaseDetailsRepository.save(dis);
	
}
public CropDiseaseDetails findById(int id) {
	return cropDiseaseDetailsRepository.findById(id);
	
}
public void deleteById(int id) {
	cropDiseaseDetailsRepository.deleteById(id);
	
}
}
