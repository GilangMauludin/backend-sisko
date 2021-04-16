package com.bootcamp.service;

import java.util.List;

import com.bootcamp.model.Klm;

public interface KlmService {
	public Klm save(Klm data);
	public Klm update(Klm data);
	public Klm delete(int id);
	public List<Klm> get();
	public Klm getById(int id);

}
