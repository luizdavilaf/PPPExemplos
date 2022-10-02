package negocio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Acao implements Subject{
    
    
    private List<Observer> observers;
    private String name;
    private int price;

    public Acao(String name, int price){
		observers = new ArrayList<Observer>();
        this.name = name;
        this.price = price;
	}

    

    public String getStockName() {
        return name;
    }

    @Override
    public void addObserver(Observer observer) {
        if (observer != null) {
            this.observers.add(observer);
        }
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            Observer observer = it.next();
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observer != null) {
            this.observers.remove(observer);
        }
    }

    public int getStockPrice() {
        return price;
    }

    public void updateStockPrice(int updatedPrice) {
        this.price = updatedPrice;
        this.notifyObservers();
    }

    public void setName(String stockName) {
        this.name = stockName;
    }

   

    
}
