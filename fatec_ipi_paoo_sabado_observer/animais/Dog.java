package fatec_ipi_paoo_sabado_observer.animais;

public class Dog extends Animal {
	@Override
	public void realizarAcao(int n) {
		for (int i = 1; i <=n; i++) {
			System.out.printf("au ");
		}
		System.out.println();	
	}
}
