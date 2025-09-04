package exercicio02;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Aluno> turmaBD = new HashSet<>();

        turmaBD.add(new Aluno(557221, "Matsu Porrada Lenta", "BD"));
        turmaBD.add(new Aluno(557221, "Jaimao Socada Forte", "ED"));
        turmaBD.add(new Aluno(557300, "Tutu Tira Fita", "BB"));
        turmaBD.add(new Aluno(557567, "Mumu Amassa Arroz", "EE"));

        Set<Aluno> turmaED = new HashSet<>();

        turmaED.add(new Aluno(557221, "Matsu Porrada Lenta", "BD"));
        turmaED.add(new Aluno(557400, "Jaimao Socada Forte", "ED"));
        turmaED.add(new Aluno(557300, "Tutu Tira Fita", "BB"));

        Set<Aluno> uniao = new HashSet<>(turmaBD);
        uniao.addAll(turmaED);

        uniao.forEach(aluno -> System.out.println(aluno));
    }
}
