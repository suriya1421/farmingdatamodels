package com.chainsys.farmingdatamodels.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.dto.CropFertilizerDetailsDTO;
import com.chainsys.farmingdatamodels.dto.FertilizerAndFertilizerDetailsDTO;
import com.chainsys.farmingdatamodels.model.CropDetails;
import com.chainsys.farmingdatamodels.model.CropFertilizerDetails;
import com.chainsys.farmingdatamodels.model.Fertilizer;
import com.chainsys.farmingdatamodels.repository.CropFertilizerRepository;
import com.chainsys.farmingdatamodels.repository.FertilizerRepository;

@Service
public class FertilizerService {
@Autowired
FertilizerRepository fertilizerRepository;
@Autowired
CropFertilizerRepository cropFertilizerRepository;

public List<Fertilizer> getFertilizer(){
	List<Fertilizer> list=fertilizerRepository.findAll();
	return list;
}
public Fertilizer save(Fertilizer fe) {
	return fertilizerRepository.save(fe);
	
}
public Fertilizer findById(int id) {
	return fertilizerRepository.findById(id);
	
}
public void deleteById(int id) {
	fertilizerRepository.deleteById(id);
	
}

public FertilizerAndFertilizerDetailsDTO getFertilizerAndFertilizerDetails(int id) {
	Fertilizer fertilizer= findById(id);
	FertilizerAndFertilizerDetailsDTO fertilizerAndFertilizerDetailsdto=new FertilizerAndFertilizerDetailsDTO();
	fertilizerAndFertilizerDetailsdto.setFertilizer(fertilizer);
	List<CropFertilizerDetails>  cropFetilizerDetails=cropFertilizerRepository.findByFertilizerId(id);
	fertilizerAndFertilizerDetailsdto.addFertilizerDetails(cropFetilizerDetails);
	return fertilizerAndFertilizerDetailsdto;
	
}


}

