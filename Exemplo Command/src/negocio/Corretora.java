package negocio;

import java.util.ArrayList;
import java.util.List;

   public class Corretora {
   private List<OrdemCommand> listaDeOrdens = new ArrayList<OrdemCommand>(); 

   public void adicionarOrdem(OrdemCommand ordem){
      listaDeOrdens.add(ordem);		
   }

   public void publicarOrdem(){
   
      for (OrdemCommand ordens : listaDeOrdens) {
         ordens.execute();
      }
      listaDeOrdens.clear();
   }
}