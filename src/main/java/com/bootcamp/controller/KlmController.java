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

import com.bootcamp.model.Klm;
import com.bootcamp.service.KlmService;
@RestController
@RequestMapping(value="/kelaslokasimap")
public class KlmController {
	@Autowired
	private KlmService klmService;
	@GetMapping
	public List<Klm> get() {
		return klmService.get();
	}
	@GetMapping(value="/{id}")
	public Klm getById(@PathVariable int id) {
		return klmService.getById(id);
	}
	@PostMapping
	public Klm save(@RequestBody Klm request) {
		return klmService.save(request);
	}
	@PatchMapping
	public Klm update(@RequestBody Klm request) {
		return klmService.update(request);
	}
	@DeleteMapping(value = "/{id}")
	public Klm delete(@PathVariable int id) {
		return klmService.delete(id);
	}

}
