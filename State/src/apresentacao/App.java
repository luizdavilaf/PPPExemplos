package apresentacao;

import negocio.*;

public class App {
    public static void main(String[] args) throws Exception {
        Aviao aviao1 = new Aviao("PR-475", "TAM");
        aviao1.decolar();
        aviao1.taxiar();
        aviao1.decolar(); 
        aviao1.voar();//aviao nao voa direto depois da decolagem... tem um tempo de decolagem acionado pelo motorista       
    }
}
