package com.bootcamp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.model.Mapel;
import com.bootcamp.repository.MapelRepo;
@Service
public class MapelSeviceImpl implements MapelService{
	private MapelRepo mapelRepo;
	
	public MapelSeviceImpl(MapelRepo mapelRepo) {
		this.mapelRepo = mapelRepo;
	}

	@Override
	public Mapel save(Mapel data) {
		// TODO Auto-generated method stub
		return this.mapelRepo.save(data);
	}

	@Override
	public Mapel update(Mapel data) {
		Mapel temp = mapelRepo.findById(data.getId()).orElse(null);
		if( temp != null) {
			temp.setId(data.getId());
			temp.setKode(data.getKode());
			temp.setNama(data.getNama());
			temp.setStatus(data.getStatus());
			
			this.mapelRepo.save(data);
		}
		return temp;
	}

	@Override
	public Mapel delete(int id) {
		Mapel temp = mapelRepo.findById(id).orElse(null);
		if(temp != null) {
			this.mapelRepo.delete(temp);
		}
		return temp;
	}

	@Override
	public List<Mapel> get() {
		return mapelRepo.findAll();
	}

	@Override
	public Mapel getById(int id) {
		
		return mapelRepo.findById(id).orElse(null);
	}

}
