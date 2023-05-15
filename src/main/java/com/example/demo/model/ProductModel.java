package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="Product")
@Data
public class ProductModel {

	@Id
	private Integer id;
	private String nombre;
	private String descripcion;
	private Integer stock;
	private Float precio;
	
}