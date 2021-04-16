package com.bootcamp.service;

import java.util.List;

import com.bootcamp.model.Mgm;

public interface MgmService {
	public Mgm save(Mgm data);
	public Mgm update(Mgm data);
	public Mgm delete(int id);
	public List<Mgm> get();
	public Mgm getById(int id);

}
