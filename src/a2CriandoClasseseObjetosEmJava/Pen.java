package a2CriandoClasseseObjetosEmJava;

public class Pen {

    //ATRIBUTOS
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    public void status(){
        System.out.println("One pen "+ this.cor);
        System.out.println("Está tampada "+ this.tampada);
        System.out.println("Qual o valor de sua ponta? "+ this.ponta);
        System.out.println("Qual a sua carga? "+ this.carga);
        System.out.println("Qual seu modelo? "+ this.modelo);
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("erro sem rabisco;");
        }
        else {
            System.out.println("rabiscando");
        }

    }

    void tampar(){
            this.tampada = true;

    }

    void destampar(){
            this.tampada = false;
    }


}
