package a12PolimorfismoDeSobreposicao;

public class Principal12 {
    public static void main(String[] args) {

       Mamifero m = new Mamifero();
       Reptil r = new Reptil();
       Ave a = new Ave();
       Peixe p = new Peixe();

       m.setPeso(35.3f);
       m.setCorPelo("caramelo");
       m.alimentar();
       m.locomover();
       m.emitirSom();


    }
}
