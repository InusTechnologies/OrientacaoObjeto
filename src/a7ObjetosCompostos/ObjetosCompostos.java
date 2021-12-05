

package a7ObjetosCompostos;

public class ObjetosCompostos {
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[6];
        lutador[0] = new Lutador("Caissara", "argentino",23, 1.70f,68.9f, "",10, 4,3);
        lutador[1] = new Lutador("Caissara1", "belga",32, 1.73f,58.9f, "",16, 24,15);
        lutador[2] = new Lutador("Caissara2", "marciano",48, 1.89f,80.2f, "",20, 34,13);
        lutador[3] = new Lutador("Caissara3", "atlantico",79, 2.25f,81.6f, "",130, 44,8);
        lutador[4] = new Lutador("Caissara4", "brasileiro",52, 0.70f,100.9f, "",1, 4,3);
        lutador[5] = new Lutador("Caissara5", "neardental",223, 3.70f,95.9f, "",1, 14,23);
        lutador[0].apresentar();
        lutador[0].status();
        lutador[1].apresentar();
        lutador[1].status();
        lutador[2].apresentar();
        lutador[2].status();
        lutador[3].apresentar();
        lutador[3].status();
        lutador[4].apresentar();
        lutador[4].status();
        lutador[5].apresentar();
        lutador[5].status();

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(lutador[0],lutador[1] );
        UFC01.Lutar();
        lutador[0].status();
        lutador[1].status();

    }
}
