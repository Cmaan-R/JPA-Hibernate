package br.com.alura.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.loja.modelo.Produto;

public class CadastroDeProdutos {

	public static void main(String[] args) {

		Produto celular = new Produto();
		celular.setNome("Samsung S22");
		celular.setDescricao("Muito Legal");
		celular.setPreco(new BigDecimal("2800"));

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
		
		EntityManager em = factory.createEntityManager();
		em.persist(celular);

	}

}
