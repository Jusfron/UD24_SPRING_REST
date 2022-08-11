package com.example.demo.dto;

import javax.persistence.*;

@Entity
@Table(name="empleados")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "trabajo")
	private String trabajo;
	@Column(name = "salario")
	private Double salario;
	
	public enum trabajo {Programador, Analista, Diseñador, Jefe};
	
	public Empleado() {
		super();
	}

	public Empleado(Long id, String nombre, String apellido, String trabajo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.trabajo = trabajo;
		
		switch(trabajo) {
		case "Programador":
			salario = 10000.0;
			break;
		case "Analista":
			salario = 20000.0;
			break;
		case "Diseñador":
			salario = 15000.0;
			break;
		case "Jefe":
			salario = 30000.0;
			break;
		default:
			this.trabajo = "null";
			salario = 0.0;
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		switch(trabajo) {
		case "Programador":
			this.trabajo = trabajo;
			salario = 10000.0;
			break;
		case "Analista":
			this.trabajo = trabajo;
			salario = 20000.0;
			break;
		case "Diseñador":
			this.trabajo = trabajo;
			salario = 15000.0;
			break;
		case "Jefe":
			this.trabajo = trabajo;
			salario = 30000.0;
			break;
		default:
			this.trabajo = "null";
			salario = 0.0;
		}
	}

	public Double getSalario() {
		return salario;
	}
	
	
	
	
}
