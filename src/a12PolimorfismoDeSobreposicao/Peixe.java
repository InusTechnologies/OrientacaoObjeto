package a12PolimorfismoDeSobreposicao;

public class Peixe extends Animal{
    private String corEscama;
    @Override
    public void locomover() {
        System.out.println("Nadando");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo minhoca");

    }

    @Override
    public void emitirSom() {
        System.out.println("barulho de peixe");

    }
}
