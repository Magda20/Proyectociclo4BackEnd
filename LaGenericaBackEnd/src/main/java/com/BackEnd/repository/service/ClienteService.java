package com.BackEnd.repository.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.BackEnd.Modelo.Clientes;
import com.BackEnd.repository.ClientesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {
	private final ClientesRepository clientesRepository;
	
	public void save (Clientes cliente) {
		clientesRepository.save(cliente);
	}
	
	public List<Clientes> findAll(){
		return  clientesRepository.findAll(); 
		
	}
	public Optional<Clientes> findById(String Cedula) {
		return clientesRepository.findById(Cedula);
	}
	
	public void deleteById(String cedula) {
		clientesRepository.deleteById(cedula);
		
	}
}

