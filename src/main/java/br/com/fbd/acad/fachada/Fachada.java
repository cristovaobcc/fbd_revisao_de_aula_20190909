/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.acad.fachada;

import br.com.fbd.acad.business.BusinnessAluno;
import br.com.fbd.acad.business.IBusinessAluno;
import br.com.fbd.acad.exececoes.AcadException;
import br.com.fbd.acad.model.Aluno;
import java.util.List;

/**
 *
 * @author cristovao
 */
public class Fachada implements IFachada{
    
    // Crie uma variavel de instancia para cada model utilizado.
    private IBusinessAluno businessAluno;
    
    // O padrao de projeto de instancia para fachada é singleton
    private static Fachada instance;
    
    private Fachada(){
        // instancie os objs aqui no construtor.
        this.businessAluno = new BusinnessAluno();
        
    }
    
    public static Fachada getInstance(){
        if (instance == null) {
            instance = new Fachada();
        }
        return instance;
    }

    @Override
    public boolean salvarOuEditar(Aluno aluno) throws AcadException {
        // Note que aqui só chamados o método que implementa a regra de negocio.
        return businessAluno.salvarOuEditar(aluno);
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
