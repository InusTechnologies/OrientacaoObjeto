package a2bCriandoClasseseObjetosEmJava;

public class Pen {

    //ATRIBUTOS
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("One pen "+ this.cor);
        System.out.println("Está tampada "+ this.tampada);
        System.out.println("Qual o valor de sua ponta? "+ this.ponta);
        System.out.println("Qual a sua carga? "+ this.carga);
        System.out.println("Qual seu modelo? "+ this.modelo);
    }

    void rabiscar(){

    }

    void tampar(){

    }

    void destampar(){

    }


}
