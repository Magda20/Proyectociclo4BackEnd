package co.edu.lagenerica.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import co.edu.lagenerica.model.Productos;

public interface ProductosRepository extends MongoRepository<Productos, Long>{
	
}