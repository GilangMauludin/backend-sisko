package com.bootcamp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.model.Klm;
import com.bootcamp.repository.KlmRepo;
@Service
public class KlmServiceImpl implements KlmService{
	private KlmRepo klmRepo;
	
	public KlmServiceImpl(KlmRepo klmRepo) {
		this.klmRepo = klmRepo;
	}

	@Override
	public Klm save(Klm data) {
		// TODO Auto-generated method stub
		return klmRepo.save(data);
	}

	@Override
	public Klm update(Klm data) {
		Klm temp = this.klmRepo.findById(data.getId()).orElse(null);
		if(temp != null) {
			temp.setkKelas(data.getkKelas());
			temp.setkLok(data.getkLok());
			temp.setStatus(data.getStatus());
			
			this.klmRepo.save(temp);
		}
		return temp;
	}

	@Override
	public Klm delete(int id) {
		Klm temp = this.klmRepo.findById(id).orElse(null);
		if(temp != null) {
			this.klmRepo.delete(temp);
		}
		return temp;
	}

	@Override
	public List<Klm> get() {
		// TODO Auto-generated method stub
		return klmRepo.findAll();
	}

	@Override
	public Klm getById(int id) {
		// TODO Auto-generated method stub
		return klmRepo.findById(id).orElse(null);
	}

}
