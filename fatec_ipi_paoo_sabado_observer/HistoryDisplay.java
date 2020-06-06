package fatec_ipi_paoo_sabado_observer;

import java.util.ArrayList;

public class HistoryDisplay implements Observer, DisplayElement {
	
	private ArrayList<Double> values = new ArrayList<Double>();
	
	private int tamanho;
	
	private double temperatura;
	
	@Override
	public void display() {
		System.out.printf("Hist�rico das �ltimas temperaturas:  %.1f\u00B0C\n", temperatura);
	}

	@Override
	public void update(double t, double h, double p) {
		values.add(t);		
		if (values.size() >= 10) {
			tamanho = values.size()-1;		
			for (int i=9; i>=0; i--) {
			temperatura = values.get(tamanho);
			tamanho = tamanho-1;	
			display();
			}
		} else { 
			System.out.println("No momento o hist�rico das temperaturas n�o est� dispon�vel!");
		}		
	}
}

