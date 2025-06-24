package com.ProjetoJpaBase.ProjetoJpaBase;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.EntityManager;

@SpringBootApplication
public class ProjetoJpaBaseApplication {


public static void main(String[] args) {
    EntityManager em = JPAUtil.getEntityManager();

    Produto produto = new Produto("Caneta Azul", 2.50);

    System.out.println("Antes de persistir: nome=" + produto.getNome() + ", preco=" + produto.getPreco());

    em.getTransaction().begin();
    em.persist(produto);
    em.getTransaction().commit();

    System.out.println("Produto salvo com ID: " + produto.getId());
	
    System.out.println("Produto salvo com nome: " + produto.getNome());
	
    System.out.println("Produto salvo com preço: " + produto.getPreco());

    em.close();
}
}
