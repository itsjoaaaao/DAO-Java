/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.tarefa.dao;

import br.com.ifba.tarefa.entities.Tarefa;
import br.com.ifba.tarefa.infrastructure.dao.BaseDAO;
import br.com.ifba.tarefa.infrastructure.dao.IBaseDAO;
import java.util.List;
import javax.persistence.Query;
/**
 *
 * @author João P. Arquim
 */
public class DAOTarefa extends BaseDAO<Tarefa> implements IDAOTarefa{

    @Override
    public List<Tarefa> findByDescricao(String descricao) {
        String busca = "SELECT a FROM Tarefa AS a WHERE a.descricao like '%:descricao%' ";
        // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(busca);
        query.setParameter("descricao", descricao);
        return query.getResultList();
    }
    
}
