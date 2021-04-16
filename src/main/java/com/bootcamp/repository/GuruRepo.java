package com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.model.Guru;
@Repository
public interface GuruRepo extends JpaRepository<Guru, Integer>{

}
