package com.chainsys.farmingdatamodels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.farmingdatamodels.model.Admin;
import com.chainsys.farmingdatamodels.repository.AdminRepository;

@Service
public class AdminService {
@Autowired
private AdminRepository  adminRepository;
public List<Admin> getAdminLogin(){
		List<Admin> admin= adminRepository.findAll();
		return admin;
}
public Admin save(Admin admin) {
	return adminRepository.save(admin) ;
	
}
public Admin findById(int id) {
	return adminRepository.findById(id);
	
}
public void deleteById(int id) {
	 adminRepository.deleteById(id);
	
}
public Admin getEmailAndPassword(String email,String password) {
	return adminRepository.findByEmailAndPassword( email, password);
}
}
