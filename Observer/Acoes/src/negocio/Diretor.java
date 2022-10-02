package negocio;

public class Diretor implements Observer {

        private String nome;
    
        public Diretor(String nome) {
                this.nome = nome;
        }

        @Override
        public void update(Acao acao) {
            System.out
                    .println(this.nome+ " o preço da ação " + acao.getStockName() + " mudou para: R$" + acao.getStockPrice());
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

   
    
}
