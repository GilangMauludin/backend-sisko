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

import com.bootcamp.model.Mgm;
import com.bootcamp.service.MgmService;
@RestController
@RequestMapping(value = "/mapelguru")
public class MgmController {
	@Autowired
	private MgmService mgmService;
	@GetMapping
	public List<Mgm> get(){
		return mgmService.get();
	}
	@GetMapping(value = "/{id}")
	public Mgm getById(@PathVariable int id) {
		return mgmService.getById(id);
	}
	@PostMapping
	public Mgm save(@RequestBody Mgm request) {
		return mgmService.save(request);
	}
	@PatchMapping
	public Mgm update(@RequestBody Mgm request) {
		return mgmService.update(request);
	}
	@DeleteMapping(value = "/{id}")
	public Mgm delete(@PathVariable int id) {
		return mgmService.delete(id);
	}
}
