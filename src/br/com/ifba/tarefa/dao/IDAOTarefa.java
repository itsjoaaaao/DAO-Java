/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.tarefa.dao;

import br.com.ifba.tarefa.entities.Tarefa;
import br.com.ifba.tarefa.infrastructure.dao.IBaseDAO;
import java.util.List;

/**
 *
 * @author João P. Arquim
 */
public interface IDAOTarefa extends IBaseDAO<Tarefa>{
    
    
    public abstract List<Tarefa> findByDescricao(String descricao);
}
