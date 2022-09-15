package negocio;

public class Acao {
	
    private String nome;
    private int quantidade;
 
    public Acao(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void comprarAcao(){
       System.out.println(quantidade+" ações da "+ nome + " compradas");
    }
    public void venderAcao(){
       System.out.println(quantidade+" ações da "+ nome + " vendidas");
    }
 }
