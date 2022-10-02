package apresentacao;

import negocio.*;

public class App {
    public static void main(String[] args) throws Exception {
        Acao ibm = new Acao("IBM", 10);
        Diretor roberto = new Diretor("Roberto");

        

        // Register Observers for stocks
        ibm.addObserver(roberto);
        

        

        // Set some random stock prices
        for (int i = 0; i < 20; i++) {
            ibm.updateStockPrice((int) (Math.random() * 101) + 1);
           
        }
        
    }
}
