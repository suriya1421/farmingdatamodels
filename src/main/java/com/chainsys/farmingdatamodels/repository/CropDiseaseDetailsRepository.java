package com.chainsys.farmingdatamodels.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.farmingdatamodels.pojo.CropDiseaseDetails;

public interface CropDiseaseDetailsRepository extends CrudRepository<CropDiseaseDetails,Integer> {
	
	CropDiseaseDetails findById(int id);
	CropDiseaseDetails save(CropDiseaseDetails cd);
	void deleteById(int disease_id);
	List<CropDiseaseDetails> findAll();
}
