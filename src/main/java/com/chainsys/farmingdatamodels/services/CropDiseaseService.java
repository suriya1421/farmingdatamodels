package com.chainsys.farmingdatamodels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.compositekey.DiseaseDetailsCompositeKey;
import com.chainsys.farmingdatamodels.model.CropDiseaseDetails;
import com.chainsys.farmingdatamodels.repository.CropDiseaseDetailsRepository;

@Service
public class CropDiseaseService {
@Autowired
CropDiseaseDetailsRepository cropDiseaseDetailsRepository;
public List<CropDiseaseDetails> getCropDisease(){
	return cropDiseaseDetailsRepository.findAll();
}
public CropDiseaseDetails save(CropDiseaseDetails dis) {
	return cropDiseaseDetailsRepository.save(dis);
	
}
public Optional<CropDiseaseDetails> findById(DiseaseDetailsCompositeKey id) {
	return cropDiseaseDetailsRepository.findById(id);
	
}
public void deleteById(DiseaseDetailsCompositeKey id) {
	cropDiseaseDetailsRepository.deleteById(id);
	
}
public List<CropDiseaseDetails> getCropDiseaseDetailsByCropId(int cropId){
	return cropDiseaseDetailsRepository.findByCropId(cropId);
}
}
