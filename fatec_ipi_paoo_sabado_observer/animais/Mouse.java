package fatec_ipi_paoo_sabado_observer.animais;

public class Mouse extends Animal {
	@Override
	public void realizarAcao(int n) {
		for (int i = 1; i <=n; i++) {
			System.out.printf("->");
		}
		System.out.println();	
	}
}
