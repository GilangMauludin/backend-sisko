package com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.model.Mgm;
@Repository
public interface MgmRepo extends JpaRepository<Mgm, Integer>{



}
