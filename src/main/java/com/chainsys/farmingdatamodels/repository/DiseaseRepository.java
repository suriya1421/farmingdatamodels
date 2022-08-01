package com.chainsys.farmingdatamodels.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.farmingdatamodels.model.Disease;

public interface DiseaseRepository extends CrudRepository<Disease,Integer> {
	Disease findById(int id);
	Disease save(Disease cd);
	void deleteById(int disease_id);
	List<Disease> findAll();
}
