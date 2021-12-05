package a3ConfigurandoVisibilidadeDeAtributosEMetodos;

/*
 ************************DIAGRAMA DE CLASSES*******************************
 * -----------------------
 * |       CANETA        |                       |
 * |---------------------|
 * |     + modelo        |
 * |      + cor          |
 * |      - ponta        |
 * |      # carga        |
 * |      # tampada      |
 * |---------------------|
 * |      + escrever()   |
 * |      + rabiscar()   |
 * |      + pintar()     |
 * |      - tampar()     |
 * |      - destampar()  |
 *  ----------------------
 *
 */

    public class  Caneta {

        //ATRIBUTOS
        public String modelo;
        public String cor;
        private float ponta;
        protected int carga;
        protected boolean tampada;
        public void status(){
            System.out.println("One pen "+ this.cor);
            System.out.println("Está tampada "+ this.tampada);
            System.out.println("Qual o valor de sua ponta? "+ this.ponta);
            System.out.println("Qual a sua carga? "+ this.carga);
            System.out.println("Qual seu modelo? "+ this.modelo);
        }

        protected void rabiscar(){
            if(this.tampada == true){
                System.out.println("erro sem rabisco;");
            }
            else {
                System.out.println("rabiscando");
            }

        }

        protected void tampar(){
            this.tampada = true;

        }

        protected void destampar(){
            this.tampada = false;
        }


    }


