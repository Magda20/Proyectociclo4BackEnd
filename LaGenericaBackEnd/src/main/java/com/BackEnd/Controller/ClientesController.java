package com.BackEnd.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BackEnd.Modelo.Clientes;
import com.BackEnd.repository.service.ClienteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ClientesController {
	private final ClienteService clienteService;
	
	@PostMapping ("/clientes")
	public void save(@RequestBody Clientes cliente) {
		clienteService.save(cliente);	
	}
	@GetMapping("/clientes")
	public List<Clientes> findAll(){
		 return clienteService.findAll();
	}
	@GetMapping("/clientes/{cedula}")
	public Clientes findById(@PathVariable String cedula) {
		return clienteService.findById(cedula).get();
	}
	@DeleteMapping("/clientes/{cedula}")
	public void deleteById(@PathVariable String cedula) {
		clienteService.deleteById(cedula);
		
	}
	@PutMapping ("/clientes")
	public void update (@RequestBody Clientes cliente) {
		clienteService.save(cliente);
		
	}
}
