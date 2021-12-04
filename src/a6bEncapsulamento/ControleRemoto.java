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


    public ControleRemoto() { // Metodo construtor sem parametro nenhum.
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //Metodos especiais getters e setters

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
//
//    public boolean isLigado() {//Sempre que for boolean ele não faz set ligado ele faz it ligado. RENOMEANDO
//        return ligado;
//    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

//    public boolean isTocando() {//Sempre que for boolean ele não faz set ligado ele faz it ligado. RENOMEANDO
//        return tocando;
//    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void abrirMenu() {

    }

    @Override
    public void fecharMenu() {

    }

    @Override
    public void maisVolume() {

    }

    @Override
    public void menosVolume() {

    }

    @Override
    public void ligarMudo() {

    }

    @Override
    public void desligarMudo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}
