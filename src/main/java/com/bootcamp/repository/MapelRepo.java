package com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.model.Mapel;
@Repository
public interface MapelRepo extends JpaRepository<Mapel, Integer>{

	

}
