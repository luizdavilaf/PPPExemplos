package negocio;

public interface AviaoState {

   public AviaoState decolar();
   
   public AviaoState estacionar();
   
   public AviaoState pousar();
   
   public AviaoState taxiar();
   
   public AviaoState voar();

   public AviaoState parar();

}
