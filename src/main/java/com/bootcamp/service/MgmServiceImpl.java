package com.bootcamp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.model.Mgm;
import com.bootcamp.repository.MgmRepo;
@Service
public class MgmServiceImpl implements MgmService{
	private MgmRepo mgmRepo;
	
	public MgmServiceImpl(MgmRepo mgmRepo) {
		this.mgmRepo = mgmRepo;
	}

	@Override
	public Mgm save(Mgm data) {
		// TODO Auto-generated method stub
		return mgmRepo.save(data);
	}

	@Override
	public Mgm update(Mgm data) {
		Mgm temp = this.mgmRepo.findById(data.getId()).orElse(null);
		if(temp != null) {
			temp.setkMapel(data.getkMapel());
			temp.setkGuru(data.getkGuru());
			temp.setStatus(data.getStatus());
			
			this.mgmRepo.save(temp);
		}
		return temp;
	}

	@Override
	public Mgm delete(int id) {
		Mgm temp = this.mgmRepo.findById(id).orElse(null);
			if(temp != null) {
				this.mgmRepo.delete(temp);
			}
			return temp;
			
		}
		

	@Override
	public List<Mgm> get() {
		// TODO Auto-generated method stub
		return mgmRepo.findAll();
	}

	@Override
	public Mgm getById(int id) {
		// TODO Auto-generated method stub
		return mgmRepo.findById(id).orElse(null);
	}

	

}
