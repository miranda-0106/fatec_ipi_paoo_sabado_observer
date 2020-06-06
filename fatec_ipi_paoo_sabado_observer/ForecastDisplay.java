package fatec_ipi_paoo_sabado_observer;

import java.util.Random;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private double previsao;
	
	public void update (double t, double h, double p) {
		this.previsao = (t - 2) + new Random().nextDouble() * 4;
		display();
	}

	@Override
	public void display() {
		System.out.printf("Previsão: %.1f\u00b0C\n", this.previsao);
	}
}
