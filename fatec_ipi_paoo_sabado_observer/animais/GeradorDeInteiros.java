package fatec_ipi_paoo_sabado_observer.animais;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class GeradorDeInteiros implements Subject {
	
	private List <Observer> observers;
	private int n;
	
	public GeradorDeInteiros() {
		observers = new LinkedList <> ();
	}
	
	public void iniciar () {
		Random gerador = new Random ();
		while(true) {
			n = gerador.nextInt(10) + 1;
			notifyObservers();
			try {
				Thread.sleep (5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(n);
		}
		
	}

}
