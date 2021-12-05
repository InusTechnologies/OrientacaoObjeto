/*
 *SuperClasse
 * Sub-classe
 * Ancestral
 * Descendente
 * Classe Raiz
 * Classe Folha
 * Generalização
 * Especialização
 * Tipos de Herança
 * Classe Abstrata
 * Metodo Abstrato
 * Classe final
 * Metodo final
 */

package a11Herança2;

public class Principal11 {
    public static void main(String[] args) {

        //Pessoa11 pessoa11 = new Pessoa11();
        Visitante visitante1 = new Visitante();
        visitante1.setNome("Juvenal");
        visitante1.setIdade(22);
        visitante1.setSexo("M");
        System.out.println(visitante1.toString());



    }
}
