package com.chainsys.farmingdatamodels.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.farmingdatamodels.pojo.CropDetails;

public interface CropDetailsRepository extends CrudRepository<CropDetails,Integer>{
CropDetails findById(int id);
CropDetails save(CropDetails cd);
void deleteById(int dr_id);
List<CropDetails> findAll();

}
