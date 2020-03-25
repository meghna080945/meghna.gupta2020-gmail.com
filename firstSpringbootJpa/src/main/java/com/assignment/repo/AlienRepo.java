package com.assignment.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.modal.Alien;

@Repository
public interface AlienRepo extends CrudRepository<Alien, Integer>{

}
