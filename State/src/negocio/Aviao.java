package negocio;

public class Aviao {

   private AviaoState estado;
   private String prefixo;
   private String operadora;

   public Aviao (String prefixo, String operadora) {
      this.estado = new Parado();
      this.operadora = operadora;
      this.prefixo = prefixo;
   }

   public AviaoState getEstado() {
      return estado;
   }

   public void setEstado(AviaoState estado) {
      this.estado = estado;
   }

   public void decolar(){
      this.estado = this.estado.decolar();
   }

   public void estacionar(){
      this.estado = this.estado.estacionar();
   }

   public void pousar(){
      this.estado = this.estado.pousar();
   }

   public void taxiar(){
      this.estado = this.estado.taxiar();
   }

   public void voar(){
      this.estado = this.estado.voar();
   }

   public void parar(){
      this.estado = this.estado.parar();
   }
}
