/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.acad.dao;

import br.com.fbd.acad.model.Aluno;
import java.util.List;

/**
 *
 * @author cristovao
 */
public interface IDaoAluno {
    boolean salvar(Aluno aluno);
    boolean editar(Aluno aluno);
    Aluno buscarPorId(int id);
    List<Aluno> getAll();
}
