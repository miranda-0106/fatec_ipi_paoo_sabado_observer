package fatec_ipi_paoo_sabado_observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject {
	
	private List<Observer> observers;
	
	private double temperature, humidity, pressure;
	
	public WeatherData () {
		observers = new LinkedList<Observer>();
	}
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(getTemperature(), getHumidity(), getPressure());
			System.out.println("========================================================================================");
		}
	}	
	
	
	public double getTemperature() {
		return temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public double getPressure() {
		return pressure;
	}
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void iniciar() {
		setMeasurements();
	}
	
	public void setMeasurements () {
		Random gerador = new Random();
		while (true) {
			this.temperature = 20 + gerador.nextDouble() * 15; 
			this.humidity = 0.5 + gerador.nextDouble() * 0.3;
			this.pressure = 690 + gerador.nextDouble() * 15;
			measurementsChanged();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
