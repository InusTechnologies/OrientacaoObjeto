//     classe Lutador          |            |Lutador        |    classe Lutador
//        ---------------------|            |-nome          |
//        -nome:String         |            |-nacionalidade |
//        -nacionalidade:String|            |-idade         |
//        -idade: int          |            |-altura        |
//        -altura: float       |            |-peso          |
//        -peso:float          |            |-categoria     |
//        -categoria:String    |            |-vitorias      |
//        -vitorias:int        |            |-derrotas      |
//        -derrotas:int        |            |-empates       |
//        -empates:int         |            |-------------- |
//        ---------------------             |+apresentar()  |
//        Métodos                           |+status()      |
//                                          |+ganharLuta()  |
//        publico metodo apresentar()       |+perderLuta()  |
//        (...)                             |+empatarLuta() |
//        fim metodo                        |===============|
//        publico metodo Status()
//        (...)
//        fim metodo
//        publico Metodo ganharLuta()
//        (...)
//        fim metodo
//        publico Metodo perderLuta()
//        (...)
//        fim metodo
//        publico Metodo empatarLuta()
//        (...)
//        fim metodo
//     FimClasse
// -----------------------------------------------------------------------------------------------------------|

package a7ObjetosCompostos;

public class Lutador {
    //ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int empate;
    private int derrota;

    //METODOS PUBLICOS
    public void apresentar(){

    }
    public void status(){

    }
    public void ganharLuta(){

    }
    public void empatarLuta(){

    }
    public void perderLuta(){

    }

    //METODOS ESPECIAIS
    public Lutador(String nome, String nacionalidade, int idade,
                   float altura, float peso, String categoria,
                   int vitoria, int empate, int derrota) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        //this.categoria = categoria;
        this.vitoria = vitoria;
        this.empate = empate;
        this.derrota = derrota;



    }//SEPARA O CONTRUTOR DOS GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

}
