package com.chainsys.farmingdatamodels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.model.Fertilizer;
import com.chainsys.farmingdatamodels.repository.FertilizerRepository;

@Service
public class FertilizerService {
@Autowired
FertilizerRepository ferrepo;

public List<Fertilizer> getFertilizer(){
	List<Fertilizer> list=ferrepo.findAll();
	return list;
}
public Fertilizer save(Fertilizer fe) {
	return ferrepo.save(fe);
	
}
public Fertilizer findById(int id) {
	return ferrepo.findById(id);
	
}
public void deleteById(int id) {
	ferrepo.deleteById(id);
	
}


}

