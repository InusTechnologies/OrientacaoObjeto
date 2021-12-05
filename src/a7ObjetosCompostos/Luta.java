/*
classe Luta
    //Atributos
    privado desafiado : Lutador
    privado desafiante : Lutador
    privado rounds : inteiro
    privado aprovada : lógico

    //Metodos
    publico metodo marcarLuta()
            (...)
    fim metodo

    publico metodo marcarLuta()
            (...)


GETTERS E SETTERS

        publico metodo marcarLuta(l1, l2: Lutador)
            se (l1.getCategoria() = l2.getCategoria())
                e (l1<>l2) então
                aprovada = verdadeiro
                desafiado = l1
                desafiante = l2
             então
                aprovado = falso
                desafiado = nulo
                desafiante = nulo
              fim se
          fim metodo
FimClasse
*/


package a7ObjetosCompostos;
public class Luta {

    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Metodos públicos
    public void marcarLuta(){

    }
    public void Lutar(){

    }

    //Metodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
