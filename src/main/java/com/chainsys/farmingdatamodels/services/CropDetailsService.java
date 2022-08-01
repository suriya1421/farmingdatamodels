package com.chainsys.farmingdatamodels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.model.CropDetails;
import com.chainsys.farmingdatamodels.repository.CropDetailsRepository;


@Service
public class CropDetailsService {
	@Autowired
	CropDetailsRepository crop;
	public List<CropDetails> getCrop()
	{
		List<CropDetails> list=crop.findAll();
		return list;
	}
	public CropDetails save(CropDetails cr) {
		return crop.save(cr);
		
	}
	public CropDetails findById(int id) {
		return crop.findById(id);
		
	}
	public void deleteById(int id) {
		crop.deleteById(id);
	}
	

}
