package com.chainsys.farmingdatamodels.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.farmingdatamodels.pojo.UserDetails;
public interface UserDetailsRepository extends CrudRepository<UserDetails,Integer>{
	UserDetails findById(int id);
	UserDetails save(UserDetails ud);
	void deleteById(int id);
	List<UserDetails> findAll();

}
