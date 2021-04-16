package com.bootcamp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.model.Jurusan;
import com.bootcamp.repository.JurusanRepo;
@Service
public class JurusanServiceImpl implements JurusanService{
	private JurusanRepo jurusanRepo;
	
	public JurusanServiceImpl(JurusanRepo jurusanRepo) {
		 this.jurusanRepo = jurusanRepo;
	}

	@Override
	public Jurusan save(Jurusan data) {
		return this.jurusanRepo.save(data);
	}

	@Override
	public Jurusan update(Jurusan data) {
		Jurusan temp = jurusanRepo.findById(data.getId()).orElse(null);
		if(temp != null) {
			temp.setKode(data.getKode());
			temp.setNama(data.getNama());
			temp.setStatus(data.getStatus());
			
			this.jurusanRepo.save(temp);
		}
		return temp;
	}

	@Override
	public Jurusan delete(int id) {
		Jurusan temp = jurusanRepo.findById(id).orElse(null);
		if(temp != null) {
			this.jurusanRepo.delete(temp);
		}
		return temp;
	}

	@Override
	public List<Jurusan> get() {
		// TODO Auto-generated method stub
		return this.jurusanRepo.findAll();
	}

	@Override
	public Jurusan getById(int id) {
		// TODO Auto-generated method stub
		return this.jurusanRepo.findById(id).orElse(null);
	}

}
