
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirExtrato() {
		System.out.println("\nEXTRATO DA CONTA CORRENTE");
		imprimirInfosComuns();
	}
	
}
