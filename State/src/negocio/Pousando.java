package negocio;

public class Pousando implements AviaoState {

   public Pousando(){
        System.out.println("Aviao está pousando!!");        
    }

    @Override
    public AviaoState voar() {
        System.out.println("Aviao não pode voar enquanto está pousando");
        return this;
    }

    @Override
    public AviaoState estacionar() {
        System.out.println("Aviao deve primeiro taxiar para estacionar");
        return this;
    }

    @Override
    public AviaoState decolar() {
        System.out.println("Aviao não pode decolar enquanto está pousando");
        return this;
    }

    @Override
    public AviaoState parar() {
        System.out.println("Aviao não pode parar enquanto está pousando");
        return this;
    }

    @Override
    public AviaoState pousar() {
        // TODO Auto-generated method stub
        return new Pousando();
    }

    @Override
    public AviaoState taxiar() {
        // TODO Auto-generated method stub
        return new Taxiando();
    }

}
