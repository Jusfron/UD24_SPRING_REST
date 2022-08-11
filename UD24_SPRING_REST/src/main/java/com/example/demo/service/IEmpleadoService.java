package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Empleado;

public interface IEmpleadoService {
	// Metodos del CRUD
	public List<Empleado> listarEmpleados(); // Listar All

	public Empleado guardarEmpleado(Empleado empleado);

	public Empleado empleadoXID(Long id);

	public List<Empleado> listarEmpleadoNombre(String nombre);

	public List<Empleado> listarEmpleadoTrabajo(String trabajo);

	public Empleado actualizarEmpleado(Empleado empleado);

	public void eliminarEmpleado(Long id);
}
