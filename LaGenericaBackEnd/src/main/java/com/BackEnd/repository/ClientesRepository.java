package com.BackEnd.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.BackEnd.Modelo.Clientes;

@Repository
public interface ClientesRepository extends MongoRepository<Clientes,String> {
}
