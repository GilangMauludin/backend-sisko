package com.bootcamp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.model.Kelas;
import com.bootcamp.repository.KelasRepo;
@Service
public class KelasServiceImpl implements KelasService{
	private KelasRepo kelasRepo;
	
	public KelasServiceImpl(KelasRepo kelasRepo) {
		this.kelasRepo = kelasRepo;
	}

	@Override
	public Kelas save(Kelas data) {
		
		return kelasRepo.save(data);
	}

	@Override
	public Kelas update(Kelas data) {
		Kelas temp = this.kelasRepo.findById(data.getId()).orElse(null);
		if(temp != null) {
			temp.setKode(data.getKode());
			temp.setNama(data.getNama());
			temp.setJurusan(data.getJurusan());
			temp.setStatus(data.getStatus());
			
			this.kelasRepo.save(data);
		}
		
		
		return temp;
	}

	@Override
	public Kelas delete(int id) {
		Kelas temp = this.kelasRepo.findById(id).orElse(null);
		if(temp != null) {
			this.kelasRepo.delete(temp);
		}
		return temp;
	}

	@Override
	public List<Kelas> get() {
		
		return this.kelasRepo.findAll();
	}

	@Override
	public Kelas getById(int id) {
		// TODO Auto-generated method stub
		return this.kelasRepo.findById(id).orElse(null);
	}

}
