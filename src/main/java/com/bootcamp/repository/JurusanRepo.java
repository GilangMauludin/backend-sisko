package com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.model.Jurusan;
@Repository
public interface JurusanRepo extends JpaRepository<Jurusan, Integer>{

}
