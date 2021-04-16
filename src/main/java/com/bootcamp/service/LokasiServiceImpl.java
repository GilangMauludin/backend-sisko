package com.bootcamp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.model.Lokasi;
import com.bootcamp.repository.LokasiRepo;
@Service
public class LokasiServiceImpl implements LokasiService{
	private LokasiRepo lokasiRepo;
	
	public LokasiServiceImpl(LokasiRepo lokasiRepo) {
		this.lokasiRepo = lokasiRepo;
	}

	@Override
	public Lokasi save(Lokasi data) {
		return this.lokasiRepo.save(data);
	}

	@Override
	public Lokasi update(Lokasi data) {
		Lokasi temp = this.lokasiRepo.findById(data.getId()).orElse(null);
		if(temp != null) {
			temp.setNama(data.getNama());
			temp.setStatus(data.getStatus());
			
			this.lokasiRepo.save(temp);
		}
		return temp;
	}

	@Override
	public Lokasi delete(int id) {
		Lokasi temp = this.lokasiRepo.findById(id).orElse(null);
		if(temp != null) {
			this.lokasiRepo.delete(temp);
		}
		return temp;
	}

	@Override
	public List<Lokasi> get() {
		
		return this.lokasiRepo.findAll();
	}

	@Override
	public Lokasi getById(int id) {
		return this.lokasiRepo.findById(id).orElse(null);
	}

}
