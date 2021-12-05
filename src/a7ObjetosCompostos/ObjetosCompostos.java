

package a7ObjetosCompostos;

public class ObjetosCompostos {
    public static void main(String[] args) {
        Lutador lutador = new Lutador("Caissara", "argentino",23,
                1.70f,68.9f, "",10, 4,3);
        lutador.apresentar();
        lutador.status();
    }
}
