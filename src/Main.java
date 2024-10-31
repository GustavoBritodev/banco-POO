
public class Main {

	public static void main(String[] args) {
		Cliente gustavo = new Cliente();
		
		gustavo.setNome("Gustavo");
		
		Conta contaCorrente = new ContaCorrente(gustavo);
		Conta poupanca = new ContaPoupanca(gustavo);
		
		contaCorrente.depositar(150);
		contaCorrente.transferir(poupanca, 100);
		
		contaCorrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
