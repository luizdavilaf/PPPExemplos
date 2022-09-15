package negocio;

public class ComprarAcao implements OrdemCommand {
    private Acao acao;
 
    public ComprarAcao(Acao acao){
       this.acao = acao;
    }
 
    public void execute() {
      acao.comprarAcao();
    }
 }
