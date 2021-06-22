package testes;

import entities.Avaliacao;
import factory.FactoryJPA;

public class SalvarAvaliacao {
    public static void main(String[] args) {
        System.out.println("Estou Salvando uma avaliação");
        Avaliacao avaliacao1 = new Avaliacao(null, "Curso Kotlin", "Seguir passo a passo ...");

        FactoryJPA.salvarObjeto(avaliacao1);

    }
}
