package negocio;


import java.util.Random;

public class TvIterator implements Iterator {
	private Integer[] channels;
    int index;
	
	public void searchAvaiableChannels() {
		this.channels = new Integer[30];
		Random r = new Random();
		int channelsCount = 0;
		for(int i = 0; i < channels.length; i++) {
			if(r.nextInt(2) == 1) {
				channels[channelsCount++] = i;
			}
		}
		System.out.println(String.format("Foram encontrados %d canais...", channelsCount));
	}

	public Iterator iterator() {
		return new ChannelIterator(channels);
	}

    @Override
    public boolean hasNext() {
        if(index < this.channels.length){
            return true;
        }
        return false;
        
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return channels[index++];
         }
         return null;
    }
}
