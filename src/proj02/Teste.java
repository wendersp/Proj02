/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj02;

import entidades.Aluno;
import servico.CalcularMedia;

/**
 *
 * @author suporte
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Aluno aluno = new Aluno();
         aluno.setNome("Ana Maria");
         aluno.setNota1(8);
         aluno.setNota2(5);
         aluno.setMedia(CalcularMedia.calcularMedia(aluno.getNota1(), aluno.getNota2()));
         aluno.setSituacao(CalcularMedia.situacaoAluno(aluno.getMedia()));
         
         System.out.println("O aluno: " + aluno.getNome() + 
                 " com a media: " + aluno.getMedia() + 
                 " foi " + aluno.getSituacao());
    }
    
}
