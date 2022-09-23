package apresentacao;
import negocio.*;
public class App {
    public static void main(String[] args) throws Exception {
        TvIterator tv = new TvIterator();
		tv.searchAvaiableChannels();
		
        
        for(Iterator iter = tv.iterator(); iter.hasNext();) {
            Integer numeroDoCanal = (Integer)iter.next();
			System.out.println("Trocando para o canal: "+numeroDoCanal);
		}
    }
}
