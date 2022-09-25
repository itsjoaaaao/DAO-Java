/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.tarefa.service;

import java.util.List;
import br.com.ifba.tarefa.entities.Tarefa;

/**
 *
 * @author João P. Arquim
 */
public interface IServiceTarefa {
    
    //salva o aluno
    public abstract Tarefa saveTarefa(Tarefa tarefa);
    //deleta aluno
    public abstract void deleteTarefa(Tarefa tarefa);
    
    public abstract Tarefa updateTarefa(Tarefa tarefa);
    // Metodo que retorna todos os Alunos da base de dados
    public abstract List<Tarefa> getAllTarefa();
    
    public List<Tarefa> findByDescricao(String descricao);
    
}
