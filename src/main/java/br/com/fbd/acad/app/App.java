/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.acad.app;

import br.com.fbd.acad.fachada.Fachada;
import br.com.fbd.acad.fachada.IFachada;
import br.com.fbd.acad.model.Aluno;

/**
 *
 * @author cristovao
 */
public class App {
    
    public static void main(String[] args) {
        
        IFachada fachada = Fachada.getInstance();
        
        Aluno a = new Aluno("Heldon Jose", "011");
        
        try {
            fachada.salvarOuEditar(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
