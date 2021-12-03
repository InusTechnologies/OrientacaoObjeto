package a4bmetodosEspeciais;

public class MetodosGetterSetterConstrutor {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("nic", "amarela", 0.5f );
//        //c1.setModelo("bic "); // foi utilizado o metodo acessor
//        c1.modelo = "bicristal"; // acessou diretamente o atributo
//        c1.setPonta(0.5f); //Caso peça double coloca f no final
        c1.status();
        Caneta c2 = new Caneta(" 2 NIC ", " ROSA ", 0.1001F);
        c2.status();



    }
}
