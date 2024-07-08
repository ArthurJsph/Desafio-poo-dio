
package bootcamp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {

 
    public static void main(String[] args) {
       Curso curso1 = new Curso();
       curso1.setTitulo("curso Java");
       curso1.setDescricao("curso java");
       curso1.setCargaHoraria(8);
       
       Curso curso2 = new Curso();
       curso2.setTitulo("curso JavaScript");
       curso2.setDescricao("curso javaScript");
       curso2.setCargaHoraria(12);
       
       Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("Mentoria de Java");
       mentoria.setDescricao("mentoria de Java");
       mentoria.setData(LocalDate.now());
              
       //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Bootcamp de Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.InscreverBootcamps(bootcamp);
        System.out.println("Conteudos inscritos de Arthur: " + devArthur.getConteudosInscritos());
        devArthur.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos de Arthur: " + devArthur.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Arthur: " + devArthur.getConteudosConcluidos());
        System.out.println("Xp de Arthur: " + devArthur.calcularTotalXp());
        
        System.out.println("------------");
        
        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.InscreverBootcamps(bootcamp);
        System.out.println("Conteudos inscritos de Jose: " + devJose.getConteudosInscritos());
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos de Arthur: " + devArthur.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Jose: " + devJose.getConteudosConcluidos());
        System.out.println("Xp de Jose: " + devJose.calcularTotalXp());
        
    }
    
}
