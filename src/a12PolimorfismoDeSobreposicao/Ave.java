package a12PolimorfismoDeSobreposicao;

public class Ave extends Animal{
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("voando");

    }

    @Override
    public void alimentar() {
        System.out.println("frutas");

    }

    @Override
    public void emitirSom() {
        System.out.println("som de ave");

    }
    public void fazerNinho(){
        System.out.println("Construindo ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
