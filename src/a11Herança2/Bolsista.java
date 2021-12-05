package a11Herança2;

public class Bolsista extends Aluno11{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + "é bolsista ");
    }
}
