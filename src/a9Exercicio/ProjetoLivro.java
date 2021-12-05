package a9Exercicio;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] pagina = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pagina[0] = new Pessoa("Pedro", 22, "M");
        pagina[1] = new Pessoa("Artur", 23,"M");
        pagina[2] = new Pessoa("Julia", 45,"F");

        //livro[0] = new Livro("clt");
    }
}
