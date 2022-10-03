package negocio;


public class NotaFiscal {
    private IImposto imposto;

    public NotaFiscal(IImposto imposto){
        this.imposto = imposto;
    }

    

    

    public double CalcularImposto(double valor)

    {

        return this.imposto.CalcularImposto(valor);

    }





    public IImposto getImposto() {
        return imposto;
    }





    public void setImposto(IImposto imposto) {
        this.imposto = imposto;
    }

}