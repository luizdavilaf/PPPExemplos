package negocio;

public class VenderAcao implements OrdemCommand {
    private Acao acao;
 
    public VenderAcao(Acao acao){
       this.acao = acao;
    }
 
    public void execute() {
      acao.venderAcao();
    }
 }
