package br.com.alura.loja.modelo;

import javax.persistence.Entity;

@Entity
public class Informatica extends Produto {

	private String marca;
	private Integer modelo;

	public Informatica(String autor, Integer numeroDePaginas) {
		this.marca = autor;
		this.modelo = numeroDePaginas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String autor) {
		this.marca = autor;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer numeroDePaginas) {
		this.modelo = numeroDePaginas;
	}

}
