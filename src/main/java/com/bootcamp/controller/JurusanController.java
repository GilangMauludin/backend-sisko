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

import com.bootcamp.model.Jurusan;
import com.bootcamp.service.JurusanService;
@RestController
@RequestMapping(value = "/jurusan")
public class JurusanController {
	@Autowired
	private JurusanService jurusanService;
	
	@GetMapping
	public List<Jurusan>getAll(){
		return jurusanService.get();
	}
	@GetMapping(value = "/{id}")
	public Jurusan getById(@PathVariable int id) {
		return jurusanService.getById(id);
	}
	@PostMapping
	public Jurusan simpan(@RequestBody Jurusan data) {
		return jurusanService.save(data);
	}
	@PatchMapping
	public Jurusan update(@RequestBody Jurusan data) {
		return jurusanService.update(data);
	}
	@DeleteMapping(value ="/{id}")
	public Jurusan delete(@PathVariable int id) {
		return jurusanService.delete(id);
	}

}
