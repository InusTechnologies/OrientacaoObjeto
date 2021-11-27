package a2bCriandoClasseseObjetosEmJava;

/**
 * 0. O que é um objeto,classe,atributo, método, estado,abstração.
 * ---------------------------------------------------------------------------------
 * 1. O que é um objeto?
 *      Resp: 1.1- Objeto é uma coisa material ou abstrata.
 *            1.2- Que pode ser percebida pelos sentidos.
 *            1.3- E descrita por meio das caracteristicas = atributos.
 *            1.4- Comportamentos = métodos
 *            1.5- E estado atual = status.
 *   --------------------------------------------------------------------------------
 * 2. Como definimos uma classe?
 * 3. Instanciamos objetos?
 * 4. Como manipula seus atributos e seus métodos?
 * ----------------------------------------------------------------------------------
 *
 *
 * ***************ALGORITMO********************************INSTANCIAR**************************
 *                                              *
 *        Classe Caneta                         *       c1 = nova Caneta
 *              modelo: Caractere -> String     *   Instanciando objeto c1
 *              cor: Caractere -> String        *   do tipo pen
 *              ponta: Real -> double           *   classse vai na frente
 *              carga: inteiro -> int           *
 *              tampada: Logico -> boolean      *   Agora posso mexer nos atributos
 *          METODO rabiscar()                   *   c1 =nova Caneta
 *              Se(tampada) então               *   c1.cor = "Azul"
 *                  Escreva("ERRO")             *   c1.ponta = 0.5
 *              senao                           *   c1.tampada = falso
 *                  Escreva ("Rabisco")         *
 *              FimSe                           *   Criar método para mostrar o status
 *          FIMMETODO                           *   void status(){
 *          Metodo tampar()                     *       sout("One pen " + this.cor);
 *              tampada = verdadeiro            *    -> this significa auto referência
 *          FimMetodo                           *       -> Quem chama o status será
 *        FimClasse                             *           substituido por this.
 *                                              *
 * **********************************************
 */

public class CriandoClassesEObjetosEmJava {
    public static void main(String[] args) {
            Pen c1 = new Pen();
            //c1.cor = "Azul";
            //c1.ponta = 0.5f;
            //c1.modelo = "c3";

            //c1.tampada = false;
            c1.tampar();
            //c1.destampar();
            c1.rabiscar();
            //c1.status();

            Pen c2 = new Pen();
            c2.modelo = "indionis";
            c2.cor = "preta";
            c2.destampar();
            c2.status();
            c2.rabiscar();
    }
}
