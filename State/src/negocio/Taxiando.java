package negocio;

public class Taxiando implements AviaoState {

    public Taxiando(){
        System.out.println("Aviao está Taxiando!!");        
    }


    @Override
    public AviaoState voar() {
        System.out.println("Aviao deve decolar antes de voar");
        return this;
    }


    @Override
    public AviaoState pousar() {
        System.out.println("Aviao não pode pousar enquanto está taxiando");
        return this;
    }


    @Override
    public AviaoState decolar() {
        // TODO Auto-generated method stub
        return new Decolando();
    }


    @Override
    public AviaoState estacionar() {
        // TODO Auto-generated method stub
        return new Estacionado();
    }


    @Override
    public AviaoState taxiar() {
        // TODO Auto-generated method stub
        return new Taxiando();
    }


    @Override
    public AviaoState parar() {
        // TODO Auto-generated method stub
        return new Parado();
    }

}
