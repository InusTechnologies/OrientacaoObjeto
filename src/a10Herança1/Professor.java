package a10Herança1;

public class Professor extends Pessoa{

    //ATRIBUTOS
    private String especialidade;
    private double salario;

    //METODOS
    public void ReceberAumento(double aumento){
        this.salario += aumento;

    }

    //METODOS ESPECIAIS


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
