package negocio;

public class Parado implements AviaoState {

    public Parado(){
        System.out.println("Aviao está parado!!");        
    }


    @Override
    public AviaoState voar() {
        System.out.println("Aviao deve taxiar antes de voar");
        return this;
    }

    @Override
    public AviaoState estacionar() {
        System.out.println("Aviao não pode estacionar enquanto está parado");
        return this;
    }

    @Override
    public AviaoState decolar() {
        System.out.println("Aviao não pode decolar enquanto está parado");
        return this;
    }

    @Override
    public AviaoState pousar() {
        System.out.println("Aviao não pode pousar enquanto está parado");
        return this;
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
