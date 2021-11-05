package com.BackEnd.Modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Document(value="db_clientes")
@Data
public class Clientes {
	
	@Id
	private String cedula;
	private String Nombre;
	private String Direccion; 
	private String Telefono; 
	private String Correo;
	
}
