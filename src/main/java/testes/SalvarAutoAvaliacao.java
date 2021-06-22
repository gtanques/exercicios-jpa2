package testes;

import entities.AutoAvaliacao;
import entities.Solucao;
import factory.FactoryJPA;

public class SalvarAutoAvaliacao {
    public static void main(String[] args) {
        System.out.println("Estou Salvando uma auto avaliação");
        Solucao solucao1 = FactoryJPA.em.find(Solucao.class, 1L);
        AutoAvaliacao autoAvaliacao1 = new AutoAvaliacao(null, 10, solucao1);
        FactoryJPA.salvarObjeto(autoAvaliacao1);
    }
}
