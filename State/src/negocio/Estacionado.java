package negocio;

public class Estacionado implements AviaoState {

    public Estacionado(){
        System.out.println("Aviao está estacionado!!");        
    }

    @Override
    public AviaoState voar() {
        System.out.println("Aviao não pode voar enquanto está estacionando");
        return this;
    }

    @Override
    public AviaoState pousar() {
        System.out.println("Aviao não pode pousar enquanto está estacionado");
        return this;
    }

    @Override
    public AviaoState decolar() {
        System.out.println("Aviao não pode decolar enquanto está estacionando");
        return this;
    }

    @Override
    public AviaoState estacionar() {        
        return new Estacionado();
    }

    @Override
    public AviaoState taxiar() {        
        return new Taxiando();
    }

    @Override
    public AviaoState parar() {        
        return new Parado();
    }

}
