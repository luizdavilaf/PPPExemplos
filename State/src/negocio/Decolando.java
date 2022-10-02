package negocio;

public class Decolando implements AviaoState {

    public Decolando(){
        System.out.println("Aviao está decolando!!");  
            
    }

    @Override
    public AviaoState taxiar() {
        System.out.println("Aviao nao pode taxiar enquanto está decolando");
        return this;
    }

    @Override
    public AviaoState estacionar() {
        System.out.println("Aviao nao pode estacionar enquanto está decolando");
        return this;
    }

    @Override
    public AviaoState pousar() {
        System.out.println("Aviao nao pode pousar enquanto está decolando");
        return this;
    }

    @Override
    public AviaoState parar() {
        System.out.println("Aviao não pode parar enquanto está decolando");
        return this;
    }

    @Override
    public AviaoState decolar() {        
        return new Decolando();
    }

    @Override
    public AviaoState voar() {        
        return new Voando();
    }

}
