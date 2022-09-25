/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.tarefa.infrastructure.exception;

/**
 *
 * @author João P. Arquim
 */
public class BusinessException extends RuntimeException{

    public BusinessException(String msg) {
        super(msg);
    }
    
    
}
