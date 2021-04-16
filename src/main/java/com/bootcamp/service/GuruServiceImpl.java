package com.bootcamp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.model.Guru;
import com.bootcamp.repository.GuruRepo;
@Service
public class GuruServiceImpl implements GuruService{
	private GuruRepo guruRepo;
	
	public GuruServiceImpl(GuruRepo guruRepo) {
		this.guruRepo = guruRepo;
	}

	@Override
	public Guru save(Guru data) {
		
		return this.guruRepo.save(data);
	}

	@Override
	public Guru update(Guru data) {
		Guru temp = this.guruRepo.findById(data.getId()).orElse(null);
		if(temp != null) {
			temp.setKode(data.getKode());
			temp.setNama(data.getNama());
			temp.setStatus(data.getStatus());
			
			this.guruRepo.save(temp);
		}
			
		return temp;
	}

	
	@Override
	public Guru delete(int id) {
		Guru temp = this.guruRepo.findById(id).orElse(null);
		if(temp != null) {
			this.guruRepo.delete(temp);
		}
		return temp;
	}

	@Override
	public List<Guru> get() {
		// TODO Auto-generated method stub
		return this.guruRepo.findAll();
	}

	@Override
	public Guru getById(int id) {
		// TODO Auto-generated method stub
		return this.guruRepo.findById(id).orElse(null);
	}

}
