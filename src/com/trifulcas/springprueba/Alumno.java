package com.trifulcas.springprueba;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.trifulcas.springprueba.validation.ValidarDni;
import com.trifulcas.springprueba.validation.ValidarEmail;


public class Alumno {
	
	@NotNull
	@Size(min = 3,message = "Debe introducir el nombre del alumno")
	private String nombre;
	
	private String becado;
	private String[] asignaturas;
	
	private Map<String,String> listaBecado;
	public Map<String, String> getListaBecado() {
	return listaBecado;
	}
	
	private Map<String,String> listaAsignaturas;
	public Map<String, String> getListaAsignaturas() {
	return listaAsignaturas;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getBecado() {
		return becado;
	}
	
	public void setBecado(String becado) {
		this.becado = becado;
	}
	
	public String[] getAsignaturas() {
		return asignaturas;
	}
	
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
		
	@ValidarDni
	private String dni;
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@ValidarEmail
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Alumno() {
		super();
		listaBecado=new LinkedHashMap<String,String>();
		listaBecado.put("Sí","Sí");
		listaBecado.put("No","No");
		
		listaAsignaturas=new LinkedHashMap<String,String>();
		listaAsignaturas.put("PHP", "PHP");
		listaAsignaturas.put("JAVA", "JAVA");
		listaAsignaturas.put("JS", "JS");
		listaAsignaturas.put(".NET", ".NET");
	}
}