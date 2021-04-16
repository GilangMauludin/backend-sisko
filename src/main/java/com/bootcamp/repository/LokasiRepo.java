package com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.model.Lokasi;
@Repository
public interface LokasiRepo extends JpaRepository<Lokasi, Integer>{

}
