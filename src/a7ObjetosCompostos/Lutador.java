/*         classe Lutador      |            |Lutador        |
          ---------------------|            |-nome          |
          -nome:String         |            |-nacionalidade |
          -nacionalidade:String|            |-idade         |
          -idade: int          |            |-altura        |
          -altura: float       |            |-peso          |
          -peso:float          |            |-categoria     |
          -categoria:String    |            |-vitorias      |
          -vitorias:int        |            |-derrotas      |
          -derrotas:int        |            |-empates       |
          -empates:int         |            |-------------- |
          ---------------------             |+apresentar()  |
                                            |+status()      |
                                            |+ganharLuta()  |
                                            |+perderLuta()  |
                                            |+empatarLuta() |
                                            |===============|


       -------------------------------------------------------------
       ************************MÉTODOS******************************
       -------------------------------------------------------------

            publico metodo apresentar()
              Escreva("Lutador: ", getNome())
              Escreva("Origem: ", geNacionalidade())
              Escreva("Idade: ", getIdade() + "anos")
              Escreva(getAltura(), "m de altura")
              Escreva("Pesando", getPeso(), "Kg")
              Escreva("Ganhou: ", getVitorias())
              Escreva("Perdeu: ", getDerrotas())
              Escreva("Empatou: ", getEmpates())
            fim metodo
            publico metodo Status()
              Escreva(getNome())
              Escreva("é um peso", geCategoria())
              Escreva("Idade: ", getIdade() + "anos")
              Escreva(getVitorias(), "vitorias")
              Escreva(getDerrotas(), "derrotas")
              Escreva(getEmpates(), "empates")
            fim metodo
            publico Metodo ganharLuta()
              (...)
            fim metodo
            publico Metodo perderLuta()
              (...)
            fim metodo
            publico Metodo empatarLuta()
              (...)
        fim metodo








          ---------------------------------------------------------
          ----*********METODOS ESPECIAIS CONSTRUTOR**********------
         ---------------------------------------------------------
          publico metodo construtor(nome:String, nacionalidade:String
                                    idade:int, altura:float, peso: float,
                                  vitorias:int, empates:int, derrotas:int)
                nome = nome
               nacionalidade = nacionalidade
                idade = idade
                altura = altura
                setPeso(peso)
                vitorias = vitorias
                empates = empates
                derrotas = derrotas
           fim metodo


        ----------------------------------------------------------
        --*********METODOS ESPECIAIS GETTERS E SETTERS**********--
        ----------------------------------------------------------
        publico metodo getNome()
          retorne nome
        fim metodo
        publico metodo setNome(nome:String)
          nome = nome
        fim metodo

        publico metodo getNacionalidade()
          retorne nacionalidade
        fim metodo
        publico metodo setNacionalidade(nacionalidade:String)
          nacionalidade = nacionalidade
        fim metodo

        publico metodo getIdade()
          retorne idade
        fim metodo
        publico metodo setIdade(idade:int)
          idade = idade
        fim metodo

        publico metodo getAltura()
          retorne altura
        fim metodo
        publico metodo setAltura(altura:float)
          altura = altura
        fim metodo

         publico metodo getPeso()
          retorne peso
        fim metodo
        publico metodo setPeso(peso:float)
          peso = peso
        fim metodo

        publico metodo getCategoria()
          retorne categoria
        fim metodo
        publico metodo setCategoria(categoria:String)
          categoria = categoria
        fim metodo

        publico metodo getVitorias()
          retorne vitorias
        fim metodo
        publico metodo setVitorias(vitorias:int)
          vitorias = vitorias
        fim metodo

        publico metodo getDerrotas()
          retorne derrotas
        fim metodo
        publico metodo setDerrotas(derrotas:int)
          derrotas = derrotas
        fim metodo

        publico metodo getEmpates()
          retorne empates
        fim metodo
        publico metodo setEmpates(empates:int)
          empates = empates
        fim metodo



  fimClasse

 */
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
        System.out.println("============================================");
        System.out.println("Apresentamos o lutador "+ this.getNome());
        System.out.println("Diretamente de "+ this.getNacionalidade());
        System.out.println("com "+ this.getIdade() + " anos e " + this.altura);
        System.out.println("pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitoria() + " vitorias ");
        System.out.println(this.getDerrota() + " derrotas ");
        System.out.println(this.getEmpate() + " empates ");
    }
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println(" Ganhou " + this.getVitoria() + "vezes");
        System.out.println(" Perdeu " + this.getDerrota() + "vezes");
        System.out.println(" Empatou " + this.getEmpate() + "vezes");

    }
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    public void empatarLuta(){
        this.setEmpate(this.getEmpate() + 1);

    }
    public void perderLuta(){
        this.setDerrota(this.getDerrota() + 1);

    }

    //METODOS ESPECIAIS
    public Lutador(String nome, String nacionalidade, int idade,
                   float altura, float peso, String categoria,
                   int vitoria, int empate, int derrota) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        //this.peso = peso;
        this.setPeso(peso);
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
    //Categoria não será utilizado do lado de fora, ficando restrito ao uso interno
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    //Categoria modifica automaticcamente quando faço atualização do peso
    private void setCategoria() {
        if (this.peso < 50){
            this.categoria = "Invalido";
        }else if (this.peso <= 70.0){
            this.categoria = "Leve";
        }else  if (this.peso <= 83.9 ){
            this.categoria = "Médio";
        }else if (this.peso <= 105.56){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Invalido";
        }
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
