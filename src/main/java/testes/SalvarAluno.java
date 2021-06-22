package testes;

import entities.Aluno;
import factory.FactoryJPA;

public class SalvarAluno {
    public static void main(String[] args) {

        System.out.println("Estou Salvando aluno");
        Aluno aluno1 = new Aluno(null, "Naruto Uzumaki", "naruto@gmail.com",18 );
        Aluno aluno2 = new Aluno(null, "Sakura Haruno", "sakura@gmail.com",18 );

        FactoryJPA.salvarObjeto(aluno2);
    }
}
