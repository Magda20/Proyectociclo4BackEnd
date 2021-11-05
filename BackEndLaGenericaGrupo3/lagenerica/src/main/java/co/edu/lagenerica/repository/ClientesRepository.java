package co.edu.lagenerica.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.edu.lagenerica.model.Clientes;

@Repository
public interface ClientesRepository extends MongoRepository<Clientes,String>{
	
}
