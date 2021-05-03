/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kowalski.leon.hibernatejpa.backend;

import entidades.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author guilherme.moura
 */
public class Backend {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("backend");
        EntityManager manager = factory.createEntityManager();
        long id = 0;
        Pessoa p = new Pessoa(id, "Luiz", "Otavio");
        
        
        manager.getTransaction().begin();
        manager.persist(p);
        manager.getTransaction().commit();

          System.out.println("ID da tarefa: " + p.getId());
        
        factory.close();
    }
}
