package fatec_ipi_paoo_sabado_observer;

import java.text.NumberFormat;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private String currentConditions;
	
	public void update (double t, double h, double p) {
		this.currentConditions = String.format(
				"Temp: %.1f\u00B0C, Hum: %s, Pres: %smmHg",
				t,
				NumberFormat.getPercentInstance().format(h),
				p
		);
		display();
	}

	@Override
	public void display() {
		System.out.printf ("Condições Atuais: %s\n", currentConditions);
	}
}
