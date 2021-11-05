package co.edu.lagenerica.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.lagenerica.repository.*;
import co.edu.lagenerica.model.*;

@RestController
@RequestMapping("productos")
public class ProductosAPI {
	
	@Autowired
	private ProductosRepository productosDAO;
	
	@PostMapping("/crear")
	public void registrarProductos(@RequestBody Productos productos) {
		productosDAO.save(productos);
	}

	@GetMapping("/listar")
	public ArrayList<Productos> listar(){
		return (ArrayList<Productos>) productosDAO.findAll();		
	}

	@GetMapping("/buscar/{codigo_producto}")
	public Optional<Productos> buscar(@PathVariable ("codigo_producto") long codigo_producto){
		return productosDAO.findById(codigo_producto);	
	}
	
	@DeleteMapping("/eliminar/{codigo_producto}")
	public void eliminarProductos(@PathVariable("codigo_producto") long codigo_producto) {
		productosDAO.deleteById(codigo_producto);
	}
		
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Productos productos) {
		productosDAO.save(productos);
	}
	
	
}



