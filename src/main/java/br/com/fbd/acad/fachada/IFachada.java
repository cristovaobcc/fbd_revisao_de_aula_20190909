/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.acad.fachada;

import br.com.fbd.acad.excecoes.AcadException;
import br.com.fbd.acad.model.Aluno;
import java.util.List;

/**
 *
 * @author cristovao
 */
public interface IFachada {
    
    // Métodos relativos ao model Aluno
    public boolean salvarOuEditar(Aluno aluno) throws AcadException;
    public Aluno buscarPorId(int id);
    public List<Aluno> getAll();
    
    // Métodos relativos a outros models deve ser postos daqui para baixo.
    // Separe-os por model.
    
}
