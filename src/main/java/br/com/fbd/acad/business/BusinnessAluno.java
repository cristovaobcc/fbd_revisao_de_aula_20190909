/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.acad.business;

import br.com.fbd.acad.dao.DaoAluno;
import br.com.fbd.acad.dao.IDaoAluno;
import br.com.fbd.acad.excecoes.AcadException;
import br.com.fbd.acad.model.Aluno;
import java.util.List;

/**
 * Classe que representa/valida as regras de negócios para o aluno.
 * Note que as tarefas dessa classe só se restringem a validar
 * regras de negócio.
 * @author cristovao
 */
public class BusinnessAluno implements IBusinessAluno{
    
    private IDaoAluno daoAluno;

    public BusinnessAluno() {
        this.daoAluno = new DaoAluno();
    }
        
    @Override
    public boolean salvarOuEditar(Aluno aluno) throws AcadException {
        if (aluno.getNome().split(" ").length <= 1) {
            throw new AcadException("Nome deve conter pelo menos nome e sobrenome.");
        }
        if (aluno.getId()==null){
            // Note que, se passar pela validacao, só chamados o método que 
            // salva os dados no BD.
            return this.daoAluno.salvar(aluno);
        }
        return false;    
    }

    @Override
    public Aluno buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
