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

public class ControleRemoto {
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

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
