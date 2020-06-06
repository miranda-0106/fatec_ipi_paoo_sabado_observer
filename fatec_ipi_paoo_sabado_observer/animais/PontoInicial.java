package fatec_ipi_paoo_sabado_observer.animais;

public class PontoInicial {

	public static void main(String[] args) {
		GeradorDeInteiros gerador = new GeradorDeInteiros();
		gerador.addObserver(new Dog());
		gerador.addObserver(new Cat());
		gerador.addObserver(new Mouse());
		gerador.addObserver(new Duck());
		gerador.iniciar();
	}

}
