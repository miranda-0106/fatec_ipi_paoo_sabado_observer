package fatec_ipi_paoo_sabado_observer.animais;

public class Duck extends Animal {
	@Override
	public void realizarAcao(int n) {
		for (int i = 1; i <=n; i++) {
			System.out.printf("0");
		}
		System.out.println();	
	}
}
