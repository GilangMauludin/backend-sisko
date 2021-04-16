package com.bootcamp.service;

import java.util.List;

import com.bootcamp.model.Jurusan;

public interface JurusanService {
	public Jurusan save(Jurusan data);
	public Jurusan update(Jurusan data);
	public Jurusan delete(int id);
	public List<Jurusan> get();
	public Jurusan getById(int id);

}
