/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba.model.tarefa.tests;

import br.com.ifba.tarefa.entities.Tarefa;
import br.com.ifba.tarefa.view.TelaTarefa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author João P. Arquim
 */
public class TarefaTeste {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tarefa ta = new Tarefa();//novo objeto da classe tarefa
        
        TelaTarefa tc = new TelaTarefa();//instanciando um novo objeto da tela cadastro
        tc.setVisible(true);//mostrando a tela
        
        //criando o banco de dados
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("meubanco");
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("meubanco");
        EntityManager manager = factory.createEntityManager();
        
        manager.getTransaction().begin();
        manager.persist(ta);//banco da classe Tarefa
        manager.getTransaction().commit();
        
        manager.close();
        factory.close();
        
    }
    
    
}
