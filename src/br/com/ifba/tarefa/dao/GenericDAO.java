/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.tarefa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import br.com.ifba.tarefa.entities.AbstractEntity;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.Persistence;

/**
 *
 * @author João P. Arquim
 */
public class GenericDAO <T extends AbstractEntity> {
    
    protected static EntityManager entityManager;
	static{
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("meubanco");
		entityManager=fac.createEntityManager();
	}
	public T getById(Long id){ 
		return (T) entityManager.find(getTypeClass(), id);
	}
	
	public void save(T entity){
		try{
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();			
		}catch(Exception e){
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	
	public void update (T entity){
		try{
			entityManager.getTransaction().begin();
			entityManager.merge(entity);
			entityManager.getTransaction().commit();			
		}catch(Exception e){
			e.printStackTrace();
			entityManager.getTransaction().rollback();		
		}
	}
	public void delete (T entity){
		try{
			entity = getById(entity.getId());
			entityManager.getTransaction().begin();
			entityManager.remove(entity);
			entityManager.getTransaction().commit();			
		}catch(Exception e){
			e.printStackTrace();
			entityManager.getTransaction().rollback();					
		}
	}	
	public List<T> findAll(){
		return entityManager.createQuery(("From "+ getTypeClass().getName())).getResultList();
	}
	private Class<?>getTypeClass(){
		Class<?> clazz = (Class<?>)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		return clazz;
	}
    
}
