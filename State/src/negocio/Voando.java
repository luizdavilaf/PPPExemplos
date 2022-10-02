package negocio;

public class Voando implements AviaoState {

    public Voando(){
        System.out.println("Aviao está voando!!");        
    }

    @Override
    public AviaoState taxiar() {
        System.out.println("Aviao deve primeiro pousar para taxiar");
        return this;
    }

    @Override
    public AviaoState estacionar() {
        System.out.println("Aviao deve primeiro taxiar para estacionar");
        return this;
    }

    @Override
    public AviaoState decolar() {
        System.out.println("Aviao não pode decolar enquanto está voando");
        return this;
    }

    @Override
    public AviaoState parar() {
        System.out.println("Aviao não pode parar enquanto está voando");
        return this;
    }

    @Override
    public AviaoState pousar() {
        // TODO Auto-generated method stub
        return new Pousando();
    }

    @Override
    public AviaoState voar() {
        // TODO Auto-generated method stub
        return new Voando();
    }

}
