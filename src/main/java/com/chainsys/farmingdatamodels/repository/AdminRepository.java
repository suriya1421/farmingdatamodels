package com.chainsys.farmingdatamodels.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.farmingdatamodels.model.Admin;

public interface AdminRepository extends CrudRepository<Admin,Integer> {
	Admin findById(int id);
	Admin save(Admin admin);
	void deleteById(int id);
	List<Admin> findAll();
	Admin findByAdminIdAndEmailAndPassword(int id, String email,String password);

}
