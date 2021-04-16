package com.bootcamp.service;

import java.util.List;

import com.bootcamp.model.Guru;

public interface GuruService {
	public Guru save(Guru data);
	public Guru update(Guru data);
	public Guru delete(int id);
	public List<Guru>get();
	public Guru getById(int id);

}
