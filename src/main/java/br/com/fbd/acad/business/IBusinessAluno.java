/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.acad.business;

import br.com.fbd.acad.excecoes.AcadException;
import br.com.fbd.acad.model.Aluno;
import java.util.List;

/**
 *
 * @author cristovao
 */
public interface IBusinessAluno {
    
    public boolean salvarOuEditar(Aluno aluno) throws AcadException;
    public Aluno buscarPorId(int id);
    public List<Aluno> getAll();
    
}
