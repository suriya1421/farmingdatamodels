package com.chainsys.farmingdatamodels.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.farmingdatamodels.compositekey.DiseaseDetailsCompositeKey;
import com.chainsys.farmingdatamodels.model.CropDiseaseDetails;
import com.chainsys.farmingdatamodels.model.CropFertilizerDetails;

public interface CropDiseaseDetailsRepository extends CrudRepository<CropDiseaseDetails, DiseaseDetailsCompositeKey> {
	Optional<CropDiseaseDetails> findById(DiseaseDetailsCompositeKey diseaseDetailsCompositeKey);

	CropDiseaseDetails save(CropDiseaseDetails cd);

	void deleteById(DiseaseDetailsCompositeKey id);

	List<CropDiseaseDetails> findAll();

	List<CropDiseaseDetails> findByCropId(int id);

	List<CropDiseaseDetails> findByDiseaseId(int id);
}
