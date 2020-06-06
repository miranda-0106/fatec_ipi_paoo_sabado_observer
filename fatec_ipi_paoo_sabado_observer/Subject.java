package fatec_ipi_paoo_sabado_observer;

public interface Subject {

	public void addObserver (Observer observer);
	public void removeObserver (Observer observer);
	public void notifyObservers();
}
