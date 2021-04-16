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

import com.bootcamp.model.Mjm;
import com.bootcamp.service.MjmService;
@RestController
@RequestMapping(value = "/mjm")
public class MjmController {
	@Autowired
	private MjmService mjmService;
	
	@GetMapping
	public List<Mjm> get(){
		return mjmService.get();
	}
	@GetMapping(value = "/{id}")
	public Mjm getById(@PathVariable int id) {
		return mjmService.getById(id);
	}
	@PostMapping
	public Mjm save(@RequestBody Mjm request) {
		return mjmService.save(request);
	}
	@PatchMapping
	public Mjm update(@RequestBody Mjm request) {
		return mjmService.update(request);
	}
	@DeleteMapping(value = "/{id}")
	public Mjm delete(@PathVariable int id) {
		return mjmService.delete(id);
	}

}
