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
}
