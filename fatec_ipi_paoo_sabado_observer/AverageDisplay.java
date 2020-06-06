package fatec_ipi_paoo_sabado_observer;

import java.util.ArrayList;

public class AverageDisplay implements Observer, DisplayElement {
	
	private ArrayList<Double> values = new ArrayList<Double>();
	
	private double soma = 0;
	
	private double media = 0;
	
	private int tamanho;
	
	@Override
	public void display() {
		System.out.printf("A media das últimas 10 temperaturas é %.1f\u00B0C\n", media);
	}

	@Override
	public void update(double t, double h, double p) {
		values.add(t);		
		if (values.size() >= 10) {
			tamanho = values.size()-1;		
			for (int i=9; i>=0; i--) {
			soma = values.get(tamanho) + soma;
			tamanho = tamanho-1;		
			}
			media = soma/10;
			display();
			soma = 0;
		} else { 
			System.out.println("No momento a média das temperaturas não está disponível!");
		}		
	}
}

