package com.bootcamp.service;

import java.util.List;

import com.bootcamp.model.Lokasi;

public interface LokasiService {
	public Lokasi save(Lokasi data);
	public Lokasi update(Lokasi data);
	public Lokasi delete(int id);
	public List<Lokasi> get();
	public Lokasi getById(int id);

}
