package com.bootcamp.service;

import java.util.List;

import com.bootcamp.model.Mjm;

public interface MjmService {
	public Mjm save(Mjm data);
	public Mjm update(Mjm data);
	public Mjm delete(int id);
	public List<Mjm> get();
	public Mjm getById(int id);

}
