package com.bootcamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.model.Lokasi;
import com.bootcamp.service.LokasiService;
@RestController
@RequestMapping(value = "/lokasi")
public class LokasiController {
	@Autowired
	private LokasiService lokasiService;
	
	@GetMapping
	public List<Lokasi> getAll(){
		return lokasiService.get();
	}
	@GetMapping(value = "/{id}")
	public Lokasi getById(@PathVariable int id) {
		return lokasiService.getById(id);
	}
	@PostMapping
	public Lokasi simpan(@RequestBody Lokasi request) {
		return lokasiService.save(request);
	}
	@PatchMapping
	public Lokasi update(@RequestBody Lokasi request) {
		return lokasiService.update(request);
	}
	@DeleteMapping(value = "/{id}")
	public Lokasi delete(@PathVariable int id) {
		return lokasiService.delete(id);
	}

}
