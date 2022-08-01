package com.chainsys.farmingdatamodels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.model.UserDetails;
import com.chainsys.farmingdatamodels.repository.UserDetailsRepository;

@Service
public class UserDetailsService {
	@Autowired
	private UserDetailsRepository userrepo;
	
	public List<UserDetails> getUser(){
		List<UserDetails> list=userrepo.findAll();
		return list;
	}
	public UserDetails save(UserDetails ud) {
		return userrepo.save(ud);
		
	}
	public UserDetails findById(int id) {
		return userrepo.findById(id);
		
	}
	public void deleteById(int id) {
		userrepo.deleteById(id);
		
	}
	

}
