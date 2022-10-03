package negocio;

public class ImpostoSaoPaulo implements IImposto

{

@Override
public double CalcularImposto(double valor) {    
    return valor * 1.18;
}



}