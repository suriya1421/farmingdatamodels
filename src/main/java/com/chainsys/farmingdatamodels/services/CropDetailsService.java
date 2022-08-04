package com.chainsys.farmingdatamodels.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.dto.CropFertilizerDetailsDTO;
import com.chainsys.farmingdatamodels.model.CropDetails;
import com.chainsys.farmingdatamodels.model.CropFertilizerDetails;
import com.chainsys.farmingdatamodels.repository.CropDetailsRepository;
import com.chainsys.farmingdatamodels.repository.CropFertilizerRepository;

@Service
public class CropDetailsService {
	@Autowired
	CropDetailsRepository cropDetailsRepository;
	@Autowired
	CropFertilizerRepository cropFertilizerRepository;

	public List<CropDetails> getCropDetailsRepository() {
		List<CropDetails> list = cropDetailsRepository.findAll();
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

	public CropFertilizerDetailsDTO getCropAndFertilizerDetails(int id) {
		CropDetails cropDetails= findById(id);
		CropFertilizerDetailsDTO cropFertilizerDetailsDTO=new CropFertilizerDetailsDTO();
		cropFertilizerDetailsDTO.setCropDetails(cropDetails);
		List<CropFertilizerDetails>  cropFetilizerDetails=cropFertilizerRepository.findByCropId(id);
		Iterator<CropFertilizerDetails> iterator=cropFetilizerDetails.iterator();
		while(iterator.hasNext()) {
			cropFertilizerDetailsDTO.addcropFertilizerDetails((CropFertilizerDetails ) iterator.next());
		}
		return cropFertilizerDetailsDTO;
		
		

	}

}
