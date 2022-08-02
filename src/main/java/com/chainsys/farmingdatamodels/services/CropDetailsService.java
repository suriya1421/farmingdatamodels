package com.chainsys.farmingdatamodels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.model.CropDetails;
import com.chainsys.farmingdatamodels.repository.CropDetailsRepository;


@Service
public class CropDetailsService {
	@Autowired
	CropDetailsRepository cropDetailsRepository;
	public List<CropDetails> getCropDetailsRepository()
	{
		List<CropDetails> list=cropDetailsRepository.findAll();
		return list;
	}
	public CropDetails save(CropDetails cr) {
		return cropDetailsRepository.save(cr);
		
	}
	public CropDetails findById(int id) {
		return cropDetailsRepository.findById(id);
		
	}
	public void deleteById(int id) {
		cropDetailsRepository.deleteById(id);
	}
	

}
