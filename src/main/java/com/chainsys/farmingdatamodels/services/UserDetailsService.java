package com.chainsys.farmingdatamodels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.model.UserDetails;
import com.chainsys.farmingdatamodels.repository.UserDetailsRepository;

@Service
public class UserDetailsService {
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	public List<UserDetails> getUser(){
		return userDetailsRepository.findAll();
	}
	public UserDetails save(UserDetails ud) {
		return userDetailsRepository.save(ud);
		
	}
	public UserDetails findById(int id) {
		return userDetailsRepository.findById(id);
		
	}
	public void deleteById(int id) {
		userDetailsRepository.deleteById(id);
		
	}
	public UserDetails getUserByUserNameAndPassword(String name, String password) {
        return userDetailsRepository.findByuserNameAndPassword(name, password);
    }
	

}
