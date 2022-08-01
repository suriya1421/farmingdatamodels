package com.chainsys.farmingdatamodels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.model.CropFertilizerDetails;
import com.chainsys.farmingdatamodels.repository.CropFertilizerRepository;

@Service
public class CropFertilizerService {
@Autowired
CropFertilizerRepository crfer;
public List<CropFertilizerDetails>getCropFertilizer(){
	List<CropFertilizerDetails> list=crfer.findAll();
	return list;
}
	public CropFertilizerDetails save(CropFertilizerDetails cr) {
		return crfer.save(cr);
	}
	public CropFertilizerDetails findById(int id) {
		return crfer.findById(id);
		
	}
	public void deleteById(int id) {
		crfer.deleteById(id);
	}
}

