package com.bootcamp.service;

import java.util.List;

import com.bootcamp.model.Mapel;

public interface MapelService {
	public Mapel save(Mapel data);
	public Mapel update(Mapel data);
	public Mapel delete(int id);
	public List<Mapel> get();
	public Mapel getById(int id);

}
