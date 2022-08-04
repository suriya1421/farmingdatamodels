package com.chainsys.farmingdatamodels.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.farmingdatamodels.compositekey.FertilizerDetailsCompositeKey;
import com.chainsys.farmingdatamodels.model.CropFertilizerDetails;

public interface CropFertilizerRepository extends CrudRepository<CropFertilizerDetails, FertilizerDetailsCompositeKey> {
	Optional<CropFertilizerDetails> findById(FertilizerDetailsCompositeKey fertilizerDetailsCompositeKey);

	CropFertilizerDetails save(CropFertilizerDetails cd);

	void deleteById(FertilizerDetailsCompositeKey id);

	List<CropFertilizerDetails> findAll();

	List<CropFertilizerDetails> findByCropId(int id);

	List<CropFertilizerDetails> findByFertilizerId(int id);
}
