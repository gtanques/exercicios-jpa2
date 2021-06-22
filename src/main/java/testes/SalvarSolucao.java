package testes;

import entities.Aluno;
import entities.Avaliacao;
import entities.Solucao;
import factory.FactoryJPA;

public class SalvarSolucao {
    public static void main(String[] args) {
        System.out.println("Estou Salvando uma solução");

        // Buscar aluno e avaliação
        Aluno naruto = FactoryJPA.em.find(Aluno.class, 1L);
        Avaliacao avaliacao1 = FactoryJPA.em.find(Avaliacao.class, 5L);

        Solucao solucao1 = new Solucao(null, "Objetivo era balbalbal", naruto,avaliacao1);
        FactoryJPA.salvarObjeto(solucao1);
    }
}
