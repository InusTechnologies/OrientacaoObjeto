package a11Herança2;

public class Aluno11 extends Pessoa11{
    private int matricula;
    private String curso;

    public void PagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno! " + this.nome);

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
