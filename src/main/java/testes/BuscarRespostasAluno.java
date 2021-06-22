package testes;

import entities.Aluno;
import entities.Solucao;
import factory.FactoryJPA;

import javax.persistence.TypedQuery;
import java.util.List;

public class BuscarRespostasAluno {
    public static void main(String[] args) {
        //    Caso você precise carregar as respostas de um(a) aluno(a) a partir do objeto da classe Aluno, como você faria? Algum ponto de atenção?
            String sql = "select s from Solucao s where s.aluno = :pAluno";

        Aluno aluno1 = new Aluno();
        aluno1.setId(1L);

        TypedQuery<Solucao> query = FactoryJPA.em.createQuery(sql, Solucao.class);
        query.setParameter("pAluno", aluno1);

        List<Solucao> resultList = query.getResultList();

        for (Solucao s : resultList){
            System.out.println("Titulo: " + s.getAvaliacao().getTitulo());
            System.out.println("Resposta: " + s.getResposta());
        }

    }
}
