package testes;

import entities.AutoAvaliacao;
import entities.Solucao;
import factory.FactoryJPA;

import javax.persistence.TypedQuery;

public class BuscarAutoAvaliacao {
    public static void main(String[] args) {

        // Caso você precise carregar uma auto correção e tenha que descobrir o nome do(a) aluno(a)

        String sql = "select a from AutoAvaliacao a where a.solucao = :pSolucao";

        AutoAvaliacao autoAvaliacao1 = new AutoAvaliacao();
        autoAvaliacao1.setId(1L);
        Solucao solucao1 = new Solucao();
        solucao1.setId(1L);

        TypedQuery<AutoAvaliacao> query2 = FactoryJPA.em.createQuery(sql, AutoAvaliacao.class);
        query2.setParameter("pSolucao", solucao1);

        AutoAvaliacao autoAvaliacao =  query2.getSingleResult();
        System.out.println("Aluno: " + autoAvaliacao.getSolucao().getAluno().getNome());
    }
}
