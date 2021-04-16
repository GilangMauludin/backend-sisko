package com.bootcamp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.model.Mjm;
import com.bootcamp.repository.MjmRepo;
@Service
public class MjmServiceImpl implements MjmService{
	private MjmRepo mjmRepo;
	
	public MjmServiceImpl(MjmRepo mjmRepo) {
		this.mjmRepo = mjmRepo;
	}

	@Override
	public Mjm save(Mjm data) {
		return mjmRepo.save(data);
	}

	@Override
	public Mjm update(Mjm data) {
		Mjm temp = this.mjmRepo.findById(data.getId()).orElse(null);
		if(temp != null) {
			temp.setKmapel(data.getKmapel());
			temp.setKjur(data.getKjur());
			temp.setStatus(data.getStatus());
			
			this.mjmRepo.save(temp);
		}
		return temp;
	}

	@Override
	public Mjm delete(int id) {
		Mjm temp = this.mjmRepo.findById(id).orElse(null);
		if(temp != null) {
			this.mjmRepo.delete(temp);
		}
		return temp;
	}

	@Override
	public List<Mjm> get() {
		return mjmRepo.findAll();
	}

	@Override
	public Mjm getById(int id) {
		// TODO Auto-generated method stub
		return mjmRepo.findById(id).orElse(null);
	}

}
