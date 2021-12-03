//Classe ContaBanco
//        //Atributos
//        publico numConta:Inteiro
//        protegido tipo: Caractere
//        privado dono: Caractere
//        privado saldo: real
//        privado status: Logico
//
//        //Metodos
//        publico Metodo abrirConta()
//        (...)
//        FimMetodo
//        publico Metodo fecharConta()
//        (...)
//        FimMetodo
//        publico Metodo depositarConta()
//        (...)
//        FimMetodo
//        publico Metodo sacarConta()
//        (...)
//        FimMetodo
//        publico Metodo pagarMensal()
//        (...)
//        FimMetodo
////        FimClasse
//         METODOS
//    publico Metodo abrirConta(t: Caractere)
//       setTipo(t)
//       setStatus(verdadeiro)
//       se (t = "CC") ENTÃO
//            saldo = 50
//       senao se (t = "CP") entao
//        saldo = 150
//       FimSe
//   FimMetodo


package a5btestePratico;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC"){
            //this.saldo = 50;
            this.setSaldo(50);

        } else if (tipo == "CP"){
            //this.saldo = 150;
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if (this.getSaldo()>0){
            System.out.println("Conta com saldo");
        } else if (this.getSaldo()<0){
            System.out.println("Conta negativa");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
//    public void depositarConta(float v){
//        if (this.isStatus());{
//        //this.saldo = this.saldo + v;
//        this.setSaldo(this.getSaldo() + v);
//            System.out.println("Deposito realizado cm sucesso na conta de " + this.getDono());
//        }
//        else {
//            System.out.println("Conta fechada");
//        }
//    }
    public void sacarConta(){
    }
    public void pagarMensal(){
    }

    public ContaBanco(){
        //this.saldo = 0;
        //this.status = false;
        this.setSaldo(0);
        this.setStatus(false);


    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;


    }
}


