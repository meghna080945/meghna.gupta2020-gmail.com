package com.assignment.service;

import org.springframework.stereotype.Service;

import com.assignment.modal.Alien;
@Service
public interface AlienService {
	
	public void addAlien(int aid, String aname);

}
