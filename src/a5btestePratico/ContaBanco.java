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
//        FimClasse


package a5btestePratico;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta() {
    }
    public void fecharConta(){
    }
    public void depositarConta(){
    }
    public void sacarConta(){
    }
    public void pagarMensal(){
    }

    public ContaBanco(){

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


