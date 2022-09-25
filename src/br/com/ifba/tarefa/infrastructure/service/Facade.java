/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.tarefa.infrastructure.service;

import br.com.ifba.tarefa.entities.Tarefa;
import br.com.ifba.tarefa.service.IServiceTarefa;
import br.com.ifba.tarefa.service.ServiceTarefa;
import java.util.List;

/**
 *
 * @author João P. Arquim
 */
public class Facade implements IFacade{

    private final IServiceTarefa serviceTarefa = new ServiceTarefa();
    
    @Override
    public Tarefa saveTarefa(Tarefa tarefa){
        return serviceTarefa.saveTarefa(tarefa);
    }
    
    @Override
    public void deleteTarefa(Tarefa tarefa){
        this.serviceTarefa.deleteTarefa(tarefa);
    }

    @Override
    public Tarefa updateTarefa(Tarefa tarefa) {
        return serviceTarefa.updateTarefa(tarefa);
    }
    
    @Override
    public List<Tarefa> getAllTarefa() {
        return serviceTarefa.getAllTarefa();
    }
    
    @Override
    public List<Tarefa> findByDescricao(String descricao) {
        return serviceTarefa.findByDescricao(descricao);
    }
    
    
}
