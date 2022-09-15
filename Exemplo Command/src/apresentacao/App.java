package apresentacao;

import negocio.*;

public class App {
    public static void main(String[] args) throws Exception {

        Acao petrobras = new Acao("Petrobras", 100);

        ComprarAcao ordemDeCompra = new ComprarAcao(petrobras);
        VenderAcao ordemDeVenda = new VenderAcao(petrobras);
  
        Corretora corretora = new Corretora();
        corretora.adicionarOrdem(ordemDeCompra);
        corretora.adicionarOrdem(ordemDeVenda);
  
        corretora.publicarOrdem();
    }
}
