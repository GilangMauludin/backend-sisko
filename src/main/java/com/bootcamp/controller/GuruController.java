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

import com.bootcamp.model.Guru;
import com.bootcamp.service.GuruService;
@RestController
@RequestMapping(value = "/guru")
public class GuruController {
	@Autowired
	private GuruService guruService;
	
	@GetMapping
	public List<Guru> getAll(){
		return guruService.get();
	}
	@GetMapping(value = "/{id}")
	public Guru getById(@PathVariable int id) {
		return guruService.getById(id);
	}
	@PostMapping
	public Guru simpan(@RequestBody Guru request) {
		return guruService.save(request);
	}
	@PatchMapping
	public Guru update(@RequestBody Guru request) {
		return guruService.update(request);
	}
	@DeleteMapping(value = "/{id}")
	public Guru hapus(@PathVariable int id) {
		return guruService.delete(id);
	}
	
	

}
