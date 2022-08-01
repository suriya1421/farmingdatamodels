package com.chainsys.farmingdatamodels.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.farmingdatamodels.pojo.CropFertilizerDetails;

public interface CropFertilizerRepository extends CrudRepository<CropFertilizerDetails,Integer>  {
	CropFertilizerDetails findById(int id);
	CropFertilizerDetails save(CropFertilizerDetails cd);
	void deleteById(int dr_id);
	List<CropFertilizerDetails> findAll();
}
