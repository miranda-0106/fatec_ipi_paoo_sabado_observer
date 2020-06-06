package fatec_ipi_paoo_sabado_observer;

public class StatsDisplay implements Observer, DisplayElement {
	
	private double somatorio = 0;
	private int cont = 0;
	private double media;
	
	public void update (double t, double h, double p) {
		this.somatorio += t;
		this.cont++;
		this.media = somatorio / cont;
		display();
	}

	@Override
	public void display() {
		System.out.printf("Média: %.1f\u00B0C\n", this.media);
	}
}
