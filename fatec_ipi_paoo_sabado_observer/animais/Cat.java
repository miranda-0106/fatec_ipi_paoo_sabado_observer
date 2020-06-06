package fatec_ipi_paoo_sabado_observer.animais;

public class Cat extends Animal {
	@Override
	public void realizarAcao(int n) {
		for (int i = 1; i <=n; i++) {
			System.out.printf("z");
		}
		System.out.println();	
	}
}
