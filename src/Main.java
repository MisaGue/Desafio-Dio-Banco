
public class Main {

	public static void main(String[] args) {
		Cliente misael = new Cliente();
		venilton.setNome("Misael");
		
		Conta cc = new ContaCorrente(misael);
		Conta poupanca = new ContaPoupanca(misael);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
