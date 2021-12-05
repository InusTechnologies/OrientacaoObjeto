package a12PolimorfismoDeSobreposicao;

public class Reptil extends Animal{
    @Override
    public void locomover() {
        System.out.println("Arrastando-se");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo ovos");

    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");

    }
}
