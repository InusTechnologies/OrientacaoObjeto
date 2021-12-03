       /* -----------------------
        * |       CANETA        |                       |
        * |---------------------|
        * |     + modelo        |
        * |     - ponta         |
        * |                     |
        * |---------------------|
        * |      + getModelo()  |
        * |      + setModelo()  |
        * |      + getPonta()   |
        * |      - setPonta()   |
        *  ----------------------
        *
        * Classe Caneta
        *   publico modelo:Caractere
        *   privado ponta: Real
        *   publico Metodo getModelo()
        *       retorne modelo
        *   FimMetodo
        *   publico Metodo setModelo
        *           (m:caractere)
        *       modelo = m
        *   FimModelo
        *   publico Metodo getPonta()
        *       retorne ponta
        *   FimMetodo
        *   publico Metodo setPonta
        *           (p:Real)
        *       ponta = p
        *   FimMetodo
        * FimClasse
        */

package a4bmetodosEspeciais;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    //Colocando construtores executa tarefas assim que o metodo é instanciado tem o mesmo nome que a classe
    public Caneta(){ // metodo construtor é sem void
        this.tampar();
        this.cor = "azul";
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public void tampar(){this.tampada = true;}
    public void destampar(){this.tampada = false;}
    public void status(){
        System.out.println("O modelo da caneta é " + this.modelo + "de ponta " + this.ponta);
        System.out.println("O modelo da caneta é usando getters " + this.getModelo() + "de ponta " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
