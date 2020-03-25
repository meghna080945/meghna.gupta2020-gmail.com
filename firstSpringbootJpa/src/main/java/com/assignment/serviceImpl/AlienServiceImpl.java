package com.assignment.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.modal.Alien;
import com.assignment.repo.AlienRepo;
import com.assignment.service.AlienService;
@Service
public class AlienServiceImpl implements AlienService{
@Autowired
AlienRepo repo;
	@Override
	public void addAlien(int aid,String aname) {
		// TODO Auto-generated method stub
		repo.save(new Alien(aid,aname));
		
		
	}

}
