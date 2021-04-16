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

import com.bootcamp.model.Kelas;
import com.bootcamp.service.KelasService;
@RestController
@RequestMapping(value = "/kelas")
public class KelasController {
	@Autowired
	private KelasService kelasService;
	@GetMapping
	
	public List<Kelas> getAll(){
		return kelasService.get();
	}
	@GetMapping(value = "/{id}")
	public Kelas geById(@PathVariable int id) {
		return kelasService.getById(id);
	}
	@PostMapping
	public Kelas save(@RequestBody Kelas data) {
		return kelasService.save(data);
	}
	@PatchMapping
	public Kelas update(@RequestBody Kelas data) {
		return kelasService.update(data);
	}
	@DeleteMapping(value = "/{id}")
	public Kelas delete(@PathVariable int id) {
		return kelasService.delete(id);
	}

}
