package com.chainsys.farmingdatamodels.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.dto.CropDetailsAndCropDiseaseDetailsDTO;
import com.chainsys.farmingdatamodels.dto.CropFertilizerDetailsDTO;
import com.chainsys.farmingdatamodels.model.CropDetails;
import com.chainsys.farmingdatamodels.model.CropDiseaseDetails;
import com.chainsys.farmingdatamodels.model.CropFertilizerDetails;
import com.chainsys.farmingdatamodels.repository.CropDetailsRepository;
import com.chainsys.farmingdatamodels.repository.CropDiseaseDetailsRepository;
import com.chainsys.farmingdatamodels.repository.CropFertilizerRepository;

@Service
public class CropDetailsService {
	@Autowired
	CropDetailsRepository cropDetailsRepository;
	@Autowired
	CropFertilizerRepository cropFertilizerRepository;
	@Autowired
	CropDiseaseDetailsRepository cropDiseaseDetailsRepository;

	public List<CropDetails> getCropDetailsRepository() {
		return cropDetailsRepository.findAll();
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
	public List<CropDetails> getFindAll(){
		return cropDetailsRepository.findAll();
	}
	public CropFertilizerDetailsDTO getCropAndFertilizerDetails(int id) {
		CropDetails cropDetails= findById(id);
		CropFertilizerDetailsDTO cropFertilizerDetailsDTO=new CropFertilizerDetailsDTO();
		cropFertilizerDetailsDTO.setCropDetails(cropDetails);
		List<CropFertilizerDetails>  cropFetilizerDetails=cropFertilizerRepository.findByCropId(id);
		Iterator<CropFertilizerDetails> iterator=cropFetilizerDetails.iterator();
		while(iterator.hasNext()) {
			cropFertilizerDetailsDTO.addcropFertilizerDetails(iterator.next());
		}
		return cropFertilizerDetailsDTO;
		
		

	}
	public CropDetailsAndCropDiseaseDetailsDTO getCropAndDiseaseDetails(int id) {
		CropDetails cropDetails= findById(id);
		CropDetailsAndCropDiseaseDetailsDTO cropDetailsAndCropDiseaseDetailsDTO=new CropDetailsAndCropDiseaseDetailsDTO();
		cropDetailsAndCropDiseaseDetailsDTO.setCropDetails(cropDetails);
		List<CropDiseaseDetails> cropDiseaseDetails=cropDiseaseDetailsRepository.findByCropId(id);
		cropDetailsAndCropDiseaseDetailsDTO.addCropDiseaseDetails(cropDiseaseDetails);
        return cropDetailsAndCropDiseaseDetailsDTO;
	}

}
