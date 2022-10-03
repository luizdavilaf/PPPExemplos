package negocio;

public class ImpostoRio implements IImposto

{
    public ImpostoRio(){
                
    }

    @Override
    public double CalcularImposto(double valor) {        
        return valor * 1.21;
    }

}
