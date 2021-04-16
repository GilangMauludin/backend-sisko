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

import com.bootcamp.model.Mapel;
import com.bootcamp.service.MapelService;
@RestController
@RequestMapping(value = "/mapel")
public class MapelController {
	@Autowired
	private MapelService mapelService;
	@GetMapping
	public List<Mapel> getAll(){
		return mapelService.get();
	}
	@GetMapping(value = "/{id}")
	public Mapel getById(@PathVariable int id) {
		return mapelService.getById(id);
	}
	@PostMapping
	public Mapel save(@RequestBody Mapel request) {
		return mapelService.save(request);
	}
	@PatchMapping
	public Mapel update(@RequestBody Mapel request) {
		return mapelService.update(request);
	}
	@DeleteMapping(value = "/{id}")
	public Mapel delete(@PathVariable int id) {
		return mapelService.delete(id);
	}
}
