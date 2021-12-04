//        <<interface>>     | <==== |ControleRemoto |     interface Controlador
//        --------------    |       |-volume        |       //Métodos abstratos
//        +desligar()       |       |-ligado        |       publico abstrato Metodo ligar()
//        +abrirMenu()      |       |-tocando       |       publico abstrato Metodo desligar()
//        +fecharMenu()     |       |---------------|       publico abstrato Metodo abrirMenu()
//        +maisVolume()     |       |+ligar()       |       publico abstrato Metodo fecharMenu()
//        +menosVolume()    |       |+desligar()    |       publico abstrato Metodo maisVolume()
//        +ligarMudo()      |       |+abrirMenu()   |       publico abstrato Metodo menosVolume()
//        +play()           |       |+fecharMenu()  |       publico abstrato Metodo ligarMudo()
//        +pause()          |       |+maisVolume()  |       publico abstrato Metodo desligarMudo()
//===========================       |+menosVolume() |       publico abstrato Metodo play()
//                    |             |+ligarMudo()   |       publico abstrato Metodo pause()
//                    |             |+desligarMudo()|     FimInterface
//                    |             |+play()        |
//                    |             |+pause()       |
//                    |             |-setVolume()   |
//                    |             |-getVolume()   |
//                    |             |-setLigado()   |
//                    |             |-getLigado()   |
//                    |             |-getTocando()  |
//                    |             |===============
//                    |
// -----------------------------------------------------------------------------------------------------------|

package a6bEncapsulamento;

public class ControleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Metódos especiais construtor


     ControleRemoto() { // Metodo construtor sem parametro nenhum.
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //\Metodos especiais getters e setters

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }
//
//    public boolean isLigado() {//Sempre que for boolean ele não faz set ligado ele faz it ligado. RENOMEANDO
//        return ligado;
//    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

//    public boolean isTocando() {//Sempre que for boolean ele não faz set ligado ele faz it ligado. RENOMEANDO
//        return tocando;
//    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }



    // **********METODOS ABSTRATOS***************

    @Override  //Override significa sobreescrever
    public void ligar() {
        this.setLigado(true);

    }

    @Override //#########Dúvida#########
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----------MENU----------");
        System.out.println("Está ligado? "+ this.getLigado());
        System.out.println("Está tocando? "+ this.getTocando());
        System.out.println("VOLUME: "+ this.getVolume());
        for (int i =0; i<=this.getVolume(); i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");

    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() +1);
        }

    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() -1);
        }


    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(50);
        }

    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }

    }

    @Override
    public void play() {
        if (this.getLigado() && ! (this.getTocando())){
            this.setTocando(true);
        }

    }

    @Override
    public void pause() {
        if (this.getLigado() &&  (this.getTocando())){
            this.setTocando(false);
        }
    }
}
