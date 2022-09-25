/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.tarefa.infrastructure.service;

import br.com.ifba.tarefa.entities.Tarefa;
import java.util.List;

/**
 *
 * @author João P. Arquim
 */
public interface IFacade {
    
    public abstract Tarefa saveTarefa(Tarefa tarefa);
    public abstract Tarefa updateTarefa(Tarefa tarefa);
    public abstract void deleteTarefa(Tarefa tarefa);
    public List<Tarefa> getAllTarefa();
    public List<Tarefa> findByDescricao(String descricao);
    
}
