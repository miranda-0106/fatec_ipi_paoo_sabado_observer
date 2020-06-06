package fatec_ipi_paoo_sabado_observer;

public class Main {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		wd.addObserver(new CurrentConditionsDisplay());
		wd.addObserver(new ForecastDisplay());
		wd.addObserver(new StatsDisplay());
		wd.addObserver(new HeatIndexDisplay());
		wd.addObserver(new AverageDisplay());
		wd.addObserver(new HistoryDisplay());
		wd.iniciar();
		
	}

}
