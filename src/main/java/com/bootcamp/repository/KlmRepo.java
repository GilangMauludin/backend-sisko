package com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.model.Klm;
@Repository
public interface KlmRepo extends JpaRepository<Klm, Integer>{

}
