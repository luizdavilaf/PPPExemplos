package apresentacao;

import negocio.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        ImpostoSaoPaulo impostoSP = new ImpostoSaoPaulo();
        ImpostoRio impostoRJ = new ImpostoRio();
        NotaFiscal notaFiscalDP = new NotaFiscal(impostoSP);
        notaFiscalDP.setImposto(impostoSP);

        System.out.println(notaFiscalDP.CalcularImposto(100));
 



 



 


    }
}
