package com.bootcamp.service;

import java.util.List;

import com.bootcamp.model.Kelas;

public interface KelasService {
	public Kelas save(Kelas data);
	public Kelas update(Kelas data);
	public Kelas delete(int id);
	public List<Kelas> get();
	public Kelas getById(int id);

}
