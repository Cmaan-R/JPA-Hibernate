package br.com.alura.loja.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preco;

}
