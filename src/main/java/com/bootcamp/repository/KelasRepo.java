package com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.model.Kelas;
@Repository
public interface KelasRepo extends JpaRepository<Kelas, Integer>{

}
