package com.chainsys.farmingdatamodels.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.farmingdatamodels.pojo.Fertilizer;

public interface FertilizerRepository extends CrudRepository<Fertilizer,Integer> {
	Fertilizer findById(int id);
	Fertilizer save(Fertilizer cd);
	void deleteById(int fertilizer_id);
	List<Fertilizer> findAll();
}
