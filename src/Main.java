import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Adicionando curso
        Cursos curso1 = new Cursos();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(6);

        // adicionar mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

        //adicionando o bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developed");
        bootcamp.setDescricao("Descricao java developeds");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //adicionando o dev
        Dev devJoao = new Dev();
        Dev devMaria = new Dev();

        // inscrevendo o devJoao
        devJoao.setNome("João");
        devJoao.inscrever(bootcamp);

        // insrevendo a devMaria
        devMaria.setNome("Maria");
        devMaria.inscrever(bootcamp);

        // imprimindo o conteudo inscrito do Joao
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());

        //espaços
        System.out.println("**************************");

        // imprimindo o conteudo inscrito da maria
        System.out.println("Conteudo Inscrito Maria: " + devMaria.getConteudosInscritos());


        //progredindo
        devMaria.progredir();
        devJoao.progredir();
        System.out.println(" ");


        // imprimindo o conteudo inscrito do Joao
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());

        //espaços
        System.out.println("**************************");

        // imprimindo o conteudo inscrito da maria
        System.out.println("Conteudo Inscrito Maria: " + devMaria.getConteudosInscritos());


        // imprimindo o conteudo concluido da maria
        System.out.println("Conteudo Concluido Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("Conteudo concluido Joao: " + devJoao.getConteudosConcluidos());

        //mostrando o xp
        System.out.println(" Joao - XP: " + devJoao.calcularTotalXp());
        System.out.println(" Maria - Xp: " + devMaria.calcularTotalXp());











    }
}
