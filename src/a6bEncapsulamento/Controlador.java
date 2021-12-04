/*

//interface Controlador
////Métodos abstratos
//        publico abstrato Metodo ligar()
//        publico abstrato Metodo desligar()
//        publico abstrato Metodo abrirMenu()
//        publico abstrato Metodo fecharMenu()
//        publico abstrato Metodo maisVolume()
//        publico abstrato Metodo menosVolume()
//        publico abstrato Metodo ligarMudo()
//        publico abstrato Metodo desligarMudo()
//        publico abstrato Metodo play()
//        publico abstrato Metodo pause()
//fimInterface

*/


package a6bEncapsulamento;
public interface Controlador {
    public abstract void ligar(); //NEM SEMPRE É VOID PODE TER UM TIPO DE RETORNO
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();

}
