package com.chainsys.farmingdatamodels.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.dto.DiseaseAndDiseaseDetailsDTO;
import com.chainsys.farmingdatamodels.model.CropDiseaseDetails;
import com.chainsys.farmingdatamodels.model.Disease;
import com.chainsys.farmingdatamodels.repository.CropDiseaseDetailsRepository;
import com.chainsys.farmingdatamodels.repository.DiseaseRepository;

@Service
public class DiseaseService {
@Autowired
DiseaseRepository diseaseRepository;
@Autowired
CropDiseaseDetailsRepository cropDiseaseDetailsRepository;
public List<Disease> getDisease(){
	return diseaseRepository.findAll();
}
public Disease save(Disease dis) {
	return diseaseRepository.save(dis);
	
}
public Disease findById(int id) {
	return diseaseRepository.findById(id);
	
}
public void deleteById(int id) {
	diseaseRepository.deleteById(id);
	
}
public DiseaseAndDiseaseDetailsDTO getCropDiseaseDetails(int id) {
	Disease disease=findById(id);
	DiseaseAndDiseaseDetailsDTO diseaseAndDiseaseDetailsDTO=new DiseaseAndDiseaseDetailsDTO();
	diseaseAndDiseaseDetailsDTO.setDisease(disease);
	List<CropDiseaseDetails> cropDiseaseDetails=cropDiseaseDetailsRepository.findByDiseaseId(id);
	Iterator<CropDiseaseDetails> iterator=cropDiseaseDetails.iterator();
	while(iterator.hasNext()) {
		diseaseAndDiseaseDetailsDTO.addCropDiseaseDetails(iterator.next());
	}
	return diseaseAndDiseaseDetailsDTO;
}
}
